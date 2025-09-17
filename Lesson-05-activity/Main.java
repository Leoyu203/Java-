class Main {
	public static void main(String[] args) {
    	(new Main()).init();
	}

  void init(){
    int num1=5;
    int num2 = 10;
    int sum = num1 + num2;
    System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);

    double grade1=75.5;
    double grade2=80.0;
    double grade3=95.0;
    double calcsum = (grade1 + grade2 + grade3);
    System.out.println("The average of the grades " + grade1 + ", " + grade2 + ", and " + grade3 + " is " + calcsum);

    double avg = (calcsum)/3;
    System.out.println("The average divided by 3 is " + avg);
    
    double A = 5.0;
    double x = 1.0;
    double y = (A)/(x+1);
    System.out.println("Using the equation y= A/x+1, we can see that the answer is "+ y);

    double y2 = (2*x*(x+1)*(-x/2.0))/A;
    System.out.println("Using the equation y= 2x(x+1)(-x/2)/A, we can see that the answer is "+ y2);

    double b = 2.0;
    double h = 4.0;
    double area = (b*h)*(1.0/2.0);
    System.out.println("Using the equation area = b*h*(1/2), we get"+ area);

/*  
    Challenge 1:
    Create two integer variables and Assign values to them. 
    Calculate the sum of the two numbers and store the 
    calculated sum and then display it.
    
*/



/*  
    Challenge 2:
    Create three variables to assign three grades and Assign values to each grade. 
    Calculate the sum of the three grades and store the 
    calculated sum and then display it.
    
*/



/*  
    Challenge 3:
    Calculate the average from the three grades from challenge 2,
    store the value and then display it.
    Declare and assign values to any new variables
    NOTE: Does it look correct, check with a calculator?
*/



/*  
    Challenge 4:
    Write the following equation in EQ1.PNG file in Java; store the result and the display it:
    Declare and assign values to any new variables

*/
  

/*  
    Challenge 5:
    Using the variables same variables from challenge4 above, write the following equation in EQ2.PNG file in Java, store the result and the display it:

    Declare and assign values to any new variables

*/
 





/*  
    Challenge 6:
    Create the variables and write the equation in
    file  EQ3.PNG

    Declare and assign values to any new variables
*/
 





/*  
    **** Bonus Challenge ****:
    Create a variable that stores the total number of eggs 
    and assign it 100. We want to fill as many baskets with 
    eggs as we can. Each basket can hold only 12 eggs.

    1) Write the java code that will calcute how many baskets
    of 12 eggs can we fill fully.

    HINT: What do we get when we divide an integer by 
    an integer in Java

    2) Write the java code that will calculate how many eggs
    are left over after we filled as many baskets of 12 eggs.
*/





    // **************************************************
    // **** Don't write any code below here.  ***********
    // **************************************************
  }
}