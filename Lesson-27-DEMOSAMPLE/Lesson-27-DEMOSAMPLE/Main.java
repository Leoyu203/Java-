class Main {
    public static void main(String[] args) {
        (new Main()).init();
    }


    void print(Object o){ System.out.println(o);}
    void printt(Object o){ System.out.print(o);}


    void init(){
      char[] vowel = new char[5];
       vowel[0] ='a';
       vowel[1] ='e';
       vowel[2] ='i';
       vowel[3] ='o';
       vowel[4] ='u';

        char[] lao = new char[5];
        lao[0] = '\u0E81';   // for a
        lao[1] = '\u0E82';   // for e
        lao[2] = '\u0E84';   // for i
        lao[3] = '\u0E87';   // for o
        lao[4] = '\u0E88';    // for u

        char[] con = new char[21];
          con[0] = 'b';con[1] = 'c'; con[2] = 'd';con[3] = 'f';con[4] = 'g';con[5] = 'h';con[6] = 'j';con[7] = 'k';con[8] = 'l';con[9] = 'm';
          con[10] = 'n';con[11] = 'p';con[12] = 'q';con[13] = 'r';con[14] = 's';con[15] = 't';con[16] = 'v';con[17] = 'w';con[18] = 'x';con[19] = 'y';con[20] = 'z';

      char[] thai  = new char[21];
          thai[0] = '\u0E01';thai[1] ='\u0E02';thai[2] ='\u0E03';thai[3] ='\u0E04';thai[4] ='\u0E05'; // b c d f g
          thai[5] = '\u0E06';thai[6] ='\u0E07';thai[7] ='\u0E08';thai[8] ='\u0E09';thai[9] ='\u0E0A';  // h j k l m
          thai[10] = '\u0E0B';thai[11] ='\u0E0C';thai[12] ='\u0E0D';thai[13] = '\u0E13';thai[14] = '\u0E14';  // n p q r s
          thai[15] = '\u0E15';thai[16] = '\u0E16';thai[17] ='\u0E17';thai[18] = '\u0E18';thai[19] = '\u0E19'; // t v w x y 
          thai[20] = '\u0E22';                     // z

       
        
        String file = Input.readFile("test.txt");


        String encodedMsg1 = splice(file);
        Input.writeFile("encoded1.txt", encodedMsg1);

        String encodedMsg2 = cipher(encodedMsg1);
        Input.writeFile("encoded2.txt", encodedMsg2);

        String encodedMsg3 = subEncryption(encodedMsg2, vowel, lao);
        Input.writeFile("encoded3.txt", encodedMsg3);

        String encodedMsg4 = subEncryption2(encodedMsg3, con, thai);
        Input.writeFile("encoded4.txt", encodedMsg4);



        String encoded = Input.readFile("encoded4.txt");

        String step1 = decodeThai(encoded, con, thai);
        Input.writeFile("decoded1.txt", step1);

        String step2 = decodeLao(step1, vowel, lao);
        Input.writeFile("decoded2.txt", step2);

        String step3 = decipher(step2);
        Input.writeFile("decoded3.txt", step3);

        String decoded = unsplice(step3);
        Input.writeFile("decodedFinal.txt", decoded);



       
    }




  String splice(String txt){
    int block = 6;
    int cut = Math.min(block, txt.length());
    String blockSwap = txt.substring(cut) + txt.substring(0, cut);

    String pairSwap = "";
    for (int i = 0; i < blockSwap.length(); i += 2) {
        if (i + 1 < blockSwap.length()) {
            pairSwap += blockSwap.charAt(i + 1);
            pairSwap += blockSwap.charAt(i);
        } else {
            pairSwap += blockSwap.charAt(i);
        }
    }
    return pairSwap;
    }

  String unsplice(String txt){
    int block = 6;
    String pairSwap = "";

    for (int i = 0; i < txt.length(); i += 2){
        if (i + 1 < txt.length()){
            pairSwap += txt.charAt(i + 1);
            pairSwap += txt.charAt(i);
        } else {
            pairSwap += txt.charAt(i);
        }
    }

    int cut = Math.min(block, pairSwap.length());
    return pairSwap.substring(pairSwap.length() - cut) +
           pairSwap.substring(0, pairSwap.length() - cut);
}

  String cipher(String txt){
    String bld = "";
    int[] pattern = {1, 3, 5, 3, 1};
    int patternIndex = 0;

    for (int i = 0; i < txt.length(); i++) {
        char c = txt.charAt(i);

        if (c >= 'a' && c <= 'z') {
            int shift = pattern[patternIndex];
            patternIndex++;
            if (patternIndex >= pattern.length) {
                patternIndex = 0;
            }
            c = (char)(c + shift);
        }

        bld += c;
    }
    return bld;
}

String decipher(String txt){
    String bld = "";
    int[] pattern = {1, 3, 5, 3, 1};
    int patternIndex = 0;

    for (int i = 0; i < txt.length(); i++){
        char c = txt.charAt(i);

        if (c >= 'a' && c <= 'z'){
            int shift = pattern[patternIndex];
            patternIndex++;
            if (patternIndex >= pattern.length){
                patternIndex = 0;
            }
            c = (char)(c - shift);
        }

        bld += c;
    }
    return bld;
}

// Substitution


// Lao sub1
  String subEncryption(String l, char[] vowel, char[] lao){
    if (l == null) return "";
    String bld = "";
    for (int x = 0; x < l.length(); x++){
      char ch = l.charAt(x);
      bld += subst1(ch, vowel, lao);
    }
    return bld;
  }
 
    char subst1(char ch, char[] vowel, char[] lao){
    for(int x=0; x<vowel.length; x++){
      if(vowel[x]==ch){
        return lao[x];
      }
    }
    return ch;
}

String decodeLao(String t, char[] vowel, char[] lao){
    if (t == null) return "";
    String bld = "";
    for (int i = 0; i < t.length(); i++){
        char ch = t.charAt(i);
        bld += reverseSubst2(ch, vowel, lao);
    }
    return bld;
}

char reverseSubst2(char ch, char[] vowel, char[] lao){
    for(int i = 0; i < lao.length; i++){
        if(lao[i] == ch){
            return vowel[i];
        }
    }
    return ch;
}


// Thai subst

  String subEncryption2(String t, char[] con, char[] thai){
    if (t == null) return "";
    String bld = "";
    for (int x = 0; x < t.length(); x++){
      char ch = t.charAt(x);
      bld += subst2(ch, con, thai);
    }
    return bld;
  }
 
    char subst2(char ch, char[] con, char[] thai){
    for(int x=0; x<con.length; x++){
      if(con[x]==ch){
        return thai[x];
      }
    }
    return ch;
}

String decodeThai(String t, char[] con, char[] thai){
    if (t == null) return "";
    String bld = "";
    for (int i = 0; i < t.length(); i++){
        char ch = t.charAt(i);
        bld += reverseSubst(ch, con, thai);
    }
    return bld;
}

char reverseSubst(char ch, char[] con, char[] thai){
    for(int i = 0; i < thai.length; i++){
        if(thai[i] == ch){
            return con[i];
        }
    }
    return ch;
}







}





