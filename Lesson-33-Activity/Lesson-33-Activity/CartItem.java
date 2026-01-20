class CartItem{
  String itemName;
  double itemPrice;
  int quantity;
  boolean onSale;
  double value;

  //Create the constructor
  CartItem(String itemName, double itemPrice, int quantity, boolean onSale, double value){
    this.itemName = itemName;
    this.itemPrice = itemPrice;
    this.quantity = quantity;
    this.onSale = onSale;
    this.value = value;
  }
 


  
  // write getPrice based on condition detailed in 
  // challenges.txt
  double getItemPrice(){
    if(itemPrice == onSale){
      return itemPrice * 0.9;
    } else {
      return itemPrice;
    }

  



  }



}