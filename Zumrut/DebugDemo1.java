public class DebugDemo1
{
  public static int money;
  public static void main(String args[])
  {
      double bill1 = 45.00;
      double bill2 = 35.00;
      System.out.println("Tips: ");
      calculateTip(bill2);
      calculateTip(bill1);

  }
  public static void calculateTip(double bill)
  {
      final double rate = 2; // Consider these are percentage
      money = bill1;
      double tip;
      tip = money * rate;
      System.out.println("Tip: " + tip);
  }
}