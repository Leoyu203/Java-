class Car{
  String brand;
  String model;
  String color;
  int year;
  double value;

  Car(String brand, String color, String model, int year, double value){
    this.brand = brand;
    this.color = color;
    this.model = model;
    this.year = year;
    this.value = value;
  }

  void honk(){
    System.out.println("Beep Beep!");
  }
}