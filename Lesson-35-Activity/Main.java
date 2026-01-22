class Main {
  public static void main(String[] args)throws Exception {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init()throws Exception{

    CreateList list=new CreateList("CR101.csv");
    Student[] students = list.getStudentArray();

    // add your code below here
    int count = 0;
    for (int i = 0; i < students.length; i++) {
      Student student = students[i];
      sum += student.gpa;
      if(student.gpa >=2){
        system.out.println("PASS");
      } else{
        system.out.println("FAIL");
      }

    double percentage = 0;
    for(int i=0; i<students.length; i++){
      Student student = students[i];
      if(student.gpa <=2){
        count++;
      }
    }
    percentage = (count*100.0)/students.length;
    System.out.println("Percentage of students with GPA 2.0 or below: " + percentage + "%");

    int count = 0;
    for(int i=0; i<students.length; i++){
      Student student = students[i];
      if(student.gpa <=2.0 && student.findTeacher("CastroR")){
        count++;
      }

    int count = 0;
    for(int i=0; i<students.length; i++){
      Student student = students[i];
      if(student.gpa >=2.0 && student.findCourseStartingWith("UL")){
        count += false;
      }else{
        count++;
      } 
     
    } 
    for(int i=0; i<students.length; i++){
      Student student = students[i];
      if(student.gpa <=2.0 && student.findCourseStartingWith("UL")){
      system.out.println(student.id);
      }

    
    
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}