class Ninja{
  private int hitpoint;
  private double loyalty;
  private static int numOfNinjas=0;

  private Ninja(){
    this.hitpoint=999;
    this.loyalty=100.0;

  }
  public Ninja(int hitPoint, double loyalty){
    this.hitpoint=hitPoint;
    this.loyalty=loyalty;

  }
  public Ninja(int hitPoint){
    this();
     this.hitpoint=hitPoint;
    //this.loyalty=loyalty;
  //  setHitPoint(hitpoint);

      //setLoyalty(loyalty);
  }
  public Ninja(double loyalty){
    this();
    //this.hitpoint=hitPoint;
  //  this.loyalty=loyalty;
    setLoyalty(loyalty);
  //  setHitPoint(hitpoint);
  }
  public void setHitPoint(int hitPoint){
    this.hitpoint=hitPoint;

  }
  public int getHitPoint(){
    return hitpoint;
  }
  //---
  public void setLoyalty(double loyalty){

    this.loyalty=loyalty;
    return;
  }
    public double getLoyalty(){
      return  loyalty;
    }
    public static int getNumOfNinjas(){
      return numOfNinjas;
    }
}
