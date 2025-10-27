class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   
  }
  String creditCardType(String ccn){
    if(ccn.substring(0,1).equals("4")){
      return "Visa";
    }
    else if(ccn.substring(0,2).equals("34")||ccn.substring(0,2).equals("37")){
      return "American Express";
    }
    else if(ccn.substring(0,2).equals("36")){
      return "Diner Club";
    }
    else if(ccn.substring(0,2).equals("51")||ccn.substring(0,2).equals("55")){
      return "Mastercard";
    }
    else if(ccn.substring(0,4).equals("6011")||ccn.substring(0,2).equals("65")){
      return "Discovery";
    }
  }

  String pigLatin(String l){  
    return l.substring(1)+l.substring(0,1)+"ay";
  }

  
  
}