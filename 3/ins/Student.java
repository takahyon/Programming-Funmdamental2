class Student {
   public int studentID;
   public double score;

   public void setScore(int id, double scr){
     if(scr>0 && scr < 1000) {
       studentID = id;
       score= scr;
       System.out.println("StudentID is" + + );
     }
   }

   void display() {
   System.out.println("StudentID is" + studentID + "des");
  }
}
