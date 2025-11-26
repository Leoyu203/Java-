class Main {
  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    // Challenge1: Read in the file Original.txt and store it in a variable
    String msg = "";
    String encodedMsg = "";
    String decodedMsg = "";
    msg = Input.readFile("Original.txt");
    encoding = encode(msg);
    Input.writeFile("Encode.txt", encoding);
    decodedMsg = decode(encodedMsg);
    Input.writeFile("Decoded.txt", decodedMsg);
   

    
  }

   // Challenge2: 
  //  Write the function encode that takes in a string
  //  and create a new string that using a caesar cipher 
  // by shifting all ascii values by 3.  Don't worry about
  // wrapping arount the alphabet.
  String encode(String msg){
    String bld = "";
    for(int i = 0; i < msg.length(); i++){
      char c = msg.charAt(i);
      if(c == 'z'){
        bld += 'a';
      } else if(c == 'Z'){
        bld += 'A';
      } else {
        int ascii = (int)c;
        c = (char)(ascii + 3);
        bld += c; 
      }
    }
    return bld;
  }

  // Challenge3: 
  //  Write the function decode that takes in a string
  //  and reverses what the function in chanllenge 2
  //  so that you get the original message.
   String decode(String encode){
    String bld = "";
    for(int i = 0; i < encode.length(); i++){
      char c = encode.charAt(i);
      if(c == 'z'){
        bld += 'a';
      } else if(c == 'Z'){
        bld += 'A';
      } else {
        int ascii = (int)c;
        c = (char)(ascii - 3);
        bld += c; 
      }
    }
    return bld;
  }

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }

}