class Animal{

  String animalSpecies;
  double weight;
  double height;

  
  Animal(String animalSpecies, double weight, double height){
    this.animalSpecies  = animalSpecies;
    this.weight         = weight;
    this.height         = height;
  }

 

  // other class functions
  boolean isHealthy(){
    if(weight<30.0 && weight>100.0){
      return true;
    }else{
      return false;
    }
  }
  
  
}