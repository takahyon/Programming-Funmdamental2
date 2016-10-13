class NinjaManager{
  public static void main(String args[]){
    Ninja hanzo =new Ninja();
    hanzo.setHitpoint(700);

    Ninja jouun = new Ninja();
    jouun.setHitpoint(400);
    System.out.println(hanzo.getHitpoint());
    System.out.println(jouun.getHitpoint());
  }
}
