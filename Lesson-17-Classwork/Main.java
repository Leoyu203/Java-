class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){


    
  }
  String swapLetter(String txt){
    String bld="";
    for(int x = 0 ; x<=txt.length() ; x++){
      if(txt.substring(x,x+1).equals("a"))
        bld+="b";
      else if(txt.substring(x,x+1).equals("b"))
        bld+="a";
      else
        bld+=txt.substring(x,x+1);
    }
    return bld;
  }

  //will use reverse for problem 3
  String reverse(String s){
    String bld="";
    for(int x=s.length()-1; x>=0; x--)
      bld+=s.substring(x,x+1);

    return bld;
  }


}