class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

   
  }
  String addNums(double a, double b){
    double a = (int)(Math.random()*56)-5;
    double b = (int)(Math.random()*56)-5;
    int sum = (a + b);
    print("The sum of " + a + " and " + b + " is " + sum);
  }

  
}