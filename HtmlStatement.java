public class HtmlStatement extends Statement {

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