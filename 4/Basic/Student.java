class Student {
  private String id;
  private double height;
  private double weight;
  static int total;

  public Student(String id,double height, double weight){
    this.id = id;
    this.height = height;
    this.weight = weight;
    total++;
  }
  public double getBMI(){
  return weight/height/height*10000;
  }
  public String getID(){
    return this.id;
  }

  public int getCount(){
    return total;
  }
}
