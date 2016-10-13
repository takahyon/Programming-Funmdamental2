class Ninja{
  int hitPoint;
  double loyalty;
  void setLoyalty(double loyalty){
  if(loyalty>=100.0){
    loyalty=100.0;
  }else if(loyalty<=0.0){
    loyalty=0.0;
    }
    this.loyalty=loyalty;
    return;
    }
    double getLoyalty(){
      return  loyalty;
  }
  void setHitPoint(int hitPoint){
    this.hitPoint=hitPoint;
  }
    int getHitPoint(){
    return hitPoint;
  }
}
