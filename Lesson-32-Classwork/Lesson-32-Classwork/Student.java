class Student{

  
  String firstName;
  int gradeLevel;
  double gpa;
  double[] grades;
  String[] courses;

  
  Student(String firstName, int gradeLevel, double gpa, 
          double[] grades, String[] courses){

    this.firstName  = firstName;
    this.gradeLevel = gradeLevel;
    this.gpa        = gpa;
    this.grades     = grades;
    this.courses    = courses;
  }


  // class functions

  double calculateAvg(){
    double sum=0;
    for(int x=0; x<=this.grades.length-1;x++){
      sum+=this.grades[x];
    }
    return sum/this.grades.length;
  }

  boolean checkCourse(String course){
    for(int i=0; i<this.courses.length; i++){
        if(course.equals(this.courses[i])){
          return true;
        }
      }
  }
  return false;
}
    
