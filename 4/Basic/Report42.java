class Report42 {
  public static void main(String args[]){
    Student st1 = new Student ("A000",143.0,41.0);
    System.out.println("Student Num " + st1.getCount());
    Student st2 = new Student ("A001",185.0,63.0);

    System.out.println("ID: " + st1.getID() + " BMI: " + st1.getBMI());
    System.out.println("ID: " + st2.getID() + " BMI: " + st2.getBMI());
    System.out.println("Student Num" + st2.getCount());
  }
}
