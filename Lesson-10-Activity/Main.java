
class Main {

	public static void main(String[] args) {
    	(new Main()).init();
	}

	void init(){
  
   

  }
	double gpa(double g){
		if(g > 90){
		return 1.1*g;
		}
		else{
		return g;
		}
		}

	boolean isGraduating(int gl, double credits){
		if(gl == 12 && credits >= 44){
			return true;
		else{
			return false;
		}
	} 

	string BMI(double h, double w){
		double bmi = (w*703)/(h*h);
		if(bmi <= 18.4){
			return "underweight";
		}
		else if(bmi >= 18.5 && bmi <= 24.9){
			return "normal";
		}
		else if(bmi >= 25 && bmi <=39.9){
			return "overweight";
		}
		else{
			return "obesity";
		}
	}



 
  
}