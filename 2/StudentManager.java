class StudentManager {
  public static void main(String[] args){
    Student john = new Student(); //<<= This  is Instantce(add new to keep memory)
    john.setStudentID(20130001);

    Student ken =new Student();
    ken.setStudentID(20130002);

    Student alice= new Student();
    alice.setStudentID(20130003);


    System.out.println("JOHN "+john.getStudentID());
    System.out.println("KEN "+ken.getStudentID());
    System.out.println("ALICE "+alice.getStudentID());
  }
}
void setStudentID(int studentID){
  this.studentID = studentID;
  return
}
