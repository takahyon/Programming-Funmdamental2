class Ninja{
  private int hitpoint;
  private double loyalty;

  public Ninja(){
    this.hitpoint=999;
    this.loyalty=100.0;
  }
  public Ninja(int hitPoint, double loyalty){
    this.hitpoint=hitPoint;
    //this.loyalty=loyalty;
    setLoyalty(loyalty);
  }
  public void setHitPoint(int hitPoint){
    this.hitpoint=hitPoint;
  }
  public int getHitPoint(){
    return hitpoint;
  }
  //---
  public void setLoyalty(double loyalty){
  if(loyalty>=100.0){
    loyalty=100.0;
  }else if(loyalty<=0.0){
    loyalty=0.0;
    }
    this.loyalty=loyalty;
    return;
    }
    public double getLoyalty(){
      return  loyalty;

}
}
