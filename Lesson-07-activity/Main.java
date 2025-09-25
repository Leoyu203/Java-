
class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
/*  
    Challenge 1:
    1) Create the variables, ask the user for the variable values, write the equation in file EQ1-act6 and display the equation value.
*/
  System.out.println("Enter  value for x");
  double x = Input.readDouble();
  double y = Math.pow(x,7);
  System.out.println("Answer for this equation is" + y);

/*  
    Challenge 2:
    1) Create the variables, ask the user for the variable values, write the equation in fileEQ1.1-act6 and display the equation value.
*/
   System.out.println("Enter value for z");
   double z = Input.readDouble();
   double q = Math.pow(z,3)+5;
   System.out.println("Answer for this equation is" + q);

/*  
    Challenge 3:
    Create the variables, ask the user for the variable values, write the equation in file EQ2-act6 and display the equation value..
    
*/
    System.out.println("Enter values for t and r");
    double t = Input.readDouble();
    double r = Input.readDouble();
    double s = Math.pow(t,5)*Math.pow(r+2,4);
    System.out.println("Answer is" +s);

/*  
    Challenge 4:
    Create the variables, ask the user for the variable values, write the equation in file EQ3-act6 and display the equation value..
    
*/
    System.out.println("Enter values for A and B");
    double A = Input.readDouble();
    double B = Input.readDouble();
    double C = Math.sqrt(A+B);
    System.out.println("Answer is "+C);



/*  
    Challenge 5:
    Create the variables, ask the user for the variable values, write the equation in file EQ4-act6 and display the equation value..
    
*/
    System.out.println("Enter values for (x1,y1) and (x2,y2)");
    double x1 = Input.readDouble();
    double y1 = Input.readDouble();
    double x2 = Input.readDouble();
    double y2 = Input.readDouble();
    double d = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
    System.out.println("Answer is " +d);

/*  
    Challenge 6:
    Create the variables, ask the user for the variable values, write the equation g=sin(deg) and display the equation value..
    
*/
    System.out.println("Enter the degree");
    double deg = Input.readDouble();
    double g = Math.sin(deg);
    System.out.println("Answer is" +g);

/*  
    Challenge 7:
    Create the variables, ask the user for the variable values, write the equation in file EQ5-act6 and display the equation value.
    
*/
    System.out.println("Enter values for m and n");
    double m = Input.readDouble();
    double n = Input.readDouble();
    double k = (Math.pow(m,5))/(Math.sqrt(n+1));
    System.out.println("Answer is" + k);



/*  
    *** Bonus Challenge ***:
    Create the variables, ask the user for the variable values, write the equation in file Ch-act6 and display the equation value.

    HINT: What does the "plus minus: after "-b" mean.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}