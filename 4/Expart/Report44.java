class Report44{
  public static void main(String args[]){

    double a=0;
    double b=0;
    for(int i=0; i< 7; i++){
      FishPancake cake1 = new FishPancake(110,20);
      cake1.sell();
      a += cake1.eat();
    }

    for(int i=0; i< 4; i++){
      FishPancake cake2 = new FishPancake(200,70);
      cake2.sell();
      b += cake2.eat();
    }

    int total = FishPancake.profit();
    System.out.println("A's took Caloly was" + a);
    System.out.println("B's took Caloly was" + b);
    System.out.println("Total profit was " + total + " YEN");
  }
}
