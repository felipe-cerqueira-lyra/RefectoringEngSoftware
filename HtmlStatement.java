import java.util.Enumeration;
public class HtmlStatement extends Statement {
  
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
    return "<H1>Rentals for <EM>" + Name + "</EM></H1><P>\n";
  }
  public String Owed(double Amount){
    return "<P>You owe <EM>" + String.valueOf(Amount) + "</EM><P>\n";
  }
  public String Earned(int Amount){
    return "On this rental you earned <EM>" + String.valueOf(Amount) + "</EM> frequent renter points<P>";
  }
  public String Figures(String Title, double charge){
    return Title + ": " + String.valueOf(charge) + "<BR>\n";
  }
}