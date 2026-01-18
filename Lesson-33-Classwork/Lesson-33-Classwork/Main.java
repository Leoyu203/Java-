class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    double[] g1 = {60,70,90};
    double[] g2 = {65,75,60};
    double[] g3 = {50,40,30};
    //Create a new student object 
    String[]  courses1  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};
    String[]  courses2  = {"MRF43","PGF43Q3C","SCF43QG","HUF43X"};
    String[]  courses3  = {"EEFG7QH","FSFC3","HQFC3TH","HUF43X"};

    
    //Create a new student object 
    Student student1 = new Student("Tom",9,g1,courses1);
    if(student1.calculateAvg()>70){
    System.out.println(student1.getFirstName());
    }

    Student student2 = new Student("Jerry",11,g2,courses2);
    if(student2.calculateAvg()>70){
    System.out.println(student2.getFirstName());
    }

    Student student3 = new Student("Mickey",12,g3,courses3);
    if(student3.calculateAvg()>70){
    System.out.println(student3.getFirstName());
    }


    if(student1.getGradeLevel()<=10 && student1.calculateAvg()>=60 && student1.calculateAvg()<=70){
      System.out.println(student1.getFirstName());
    }

    if(student2.getGradeLevel()<=10 && student2.calculateAvg()>=60 && student2.calculateAvg()<=70){
      System.out.println(student2.getFirstName());
    }
    
    if(student3.getGradeLevel()<=10 && student3.calculateAvg()>=60 && student3.calculateAvg()<=70){
      System.out.println(student3.getFirstName());
    }




    
   
    

   
  }







  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}