class NinjaManager{
  public static void main(String args[]){

    System.out.println(Ninja.getNumOfNinjas());

    Ninja sakura = new Ninja(700);
    Ninja hinata = new Ninja(200.0);
    Ninja bunshin = sakura;
    bunshin.setHitPoint(1);

    System.out.println(sakura.getHitPoint());
    System.out.println(sakura.getLoyalty());

    System.out.println(hinata.getHitPoint());
    System.out.println(hinata.getLoyalty());
    System.out.println(Ninja.getNumOfNinjas());
  }
}
