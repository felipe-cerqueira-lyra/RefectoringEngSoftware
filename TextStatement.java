public class TextStatement extends Statement {

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