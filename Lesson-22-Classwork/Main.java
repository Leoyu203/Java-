class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String[]friends={"Alice","Bob","Charlie","Diana"};
    double[]celsius={0,20,37,100};
    double[]farhenheit=convertArray(celsius);
    for(int i=0;i<farhenheit.length;i++){
      print(farhenheit[i]+": ");
    }
   
    
  }

  


  double[] convertArray(double[]c){
    double[]wha=new double[c.length];
    for(int i=0;i<c.length;i++){
      wha[i]=cToF(c[i]);
    }
    return wha;
  }
  double cToF(double c){
    return c*9/5+32;
  }

}