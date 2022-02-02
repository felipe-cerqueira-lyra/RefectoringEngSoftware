import java.util.Enumeration;

public abstract class Statement {

  public abstract String CustomerName(String Name);
  public abstract String Owed(double Amount);
  public abstract String Earned(int Amount);
  public abstract String Figures(String Title, double charge);
  
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
}