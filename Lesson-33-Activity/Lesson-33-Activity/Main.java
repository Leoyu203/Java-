class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){System.out.println(o);}
  void printt(Object o){System.out.print(o);}

  void init(){
    CartItem item1 = new CartItem("Laptop", 999.99, 1, true, 999.99);
    CartItem item2 = new CartItem("Headphones", 199.99, 2, true, 399.98);
    CartItem item3 = new CartItem("Mouse", 49.99, 2, false, 99.98);

    print(item1.getItemPrice());
    print(item2.getItemPrice());
    print(item3.getItemPrice());

  
    
  }


  

  
  int randInt(int lower, int upper){
    int range = upper - lower;
    return (int)(Math.random()*range+lower);
  }


}