class Main {
	

	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
	double c = FtoC(100);
	System.out.println(c);
	
	double sv = sphereVolume(10);
	System.out.println(sv);
	
	double cv = coneVolume(10,20);
	System.out.println(cv);
	
	double d = distance(1,2,3,4);
	System.out.println(d);
	}
	void print(String msg){
		System.out.println(msg);
	}
	
	double FtoC(double F){
		double c = (F - 32) * 5.0 / 9.0;
		return c;
	}

	double sphereVolume(double r){
		double v = (4.0/3) * (Math.PI) * Math.pow(r,3);
		return v;
	}

	double coneVolume(double r, double h){
		double a = (Math.PI)*(Math.pow(r,2))*(h/3.0);
		return a;
	}

	double distance(double x1, double y1, double x2, double y2){
		double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		return d;
	}


  }

  
 
