class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){


    
  }
  String rollDice(){
    int die1 = (int)(Math.random()*6)+1;
    int die2 = (int)(Math.random()*6)+1;
    return die1 + "" + die2;
  }

  String lotto(){
    int num1 = (int)(Math.random()*48)+1;
    int num2 = (int)(Math.random()*48)+1;
    int num3 = (int)(Math.random()*48)+1;
    int num4 = (int)(Math.random()*48)+1;
    int num5 = (int)(Math.random()*48)+1;
    return num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5;
  }

  String additionTutor(){
    int.num1 = (int)(Math.random()*50)+1;
    int.num2 = (int)(Math.random()*50)+1;
    return num1 + " + " + num2 + " = answer";
    if(answer == num1 + num2){
      return "Correct!";
    } else {
      return "Incorrect. The correct answer is " + (num1 + num2);
    }
  }






}