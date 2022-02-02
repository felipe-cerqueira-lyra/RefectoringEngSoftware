import java.util.Enumeration;
public class TextStatement extends Statement {

  public String value(Customer aCustomer){
    Enumeration rentals = aCustomer.getRentals();
    String result = CustomerName(aCustomer.getName());
    while (rentals.hasMoreElements()) {
      Rental each = (Rental) rentals.nextElement();
      //show figures for each rental
      result += Figures(each.getMovie().getTitle(), each.getCharge());
    }
    //add footer lines
    result += Owed(aCustomer.getTotalCharge());
    result += Earned(aCustomer.getTotalFrequentRenterPoints());
    return result;
  }

  public String CustomerName(String Name){
    return "Rental Record for " + Name + "\n";
  }
  public String Owed(double Amount){
    return "Amount owed is " + String.valueOf(Amount) + "\n";
  }
  public String Earned(int Amount){
    return "You earned " + String.valueOf(Amount) + " frequent renter points";
  }
  public String Figures(String Title, double charge){
    return "\t" + Title + "\t" + String.valueOf(charge) + "\n";
  }
}