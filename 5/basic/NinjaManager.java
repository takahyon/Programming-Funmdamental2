class NinjaManager{
  public static void main(String args[]){
    Ninja sakura =new Ninja(700,300.0);



    Ninja hinata = new Ninja(500,200.0);

    System.out.println(sakura.getHitPoint());
    System.out.println(sakura.getLoyalty());

    System.out.println(hinata.getHitPoint());
    System.out.println(hinata.getLoyalty());
  }
}
