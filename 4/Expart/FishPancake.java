class FishPancake{
  private static int income;
  private static int outgo;
  private static int fixedCost=10;
  private static int priceOfBeanJam=500;


  private int price;
  private int ml;
  private double kcal;
  private double kcalOfBeanJam=2.4;
  private double fixedKcal=80.0;
  public FishPancake(int price , int ml){
    this.price = price;
    this.ml = ml;
    outgo += fixedCost + ml * priceOfBeanJam /1000;
  }
  public double eat(){
    return ml*kcalOfBeanJam + fixedKcal;
  }
  public void sell(){
    income += price;
  }
  public static int profit(){
    return income - outgo;
  }
}
