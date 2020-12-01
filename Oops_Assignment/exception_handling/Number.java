/*Create a class Number having the following features:
Attributes
	int		first number
	int		second number
result		double		stores the result of arithmetic operations 
performed on a and b
Member functions
Number(x, y)		constructor to initialize the values of a and b
add()			stores the sum of a and b in result
sub()			stores difference of a and b in result
mul()			stores product in result
div()			stores a divided by b in result

Test to see if b is 0 and throw an appropriate exception since division by zero is undefined.

Display a menu to the user to perform the above four arithmetic operations.
*/
package exception_handling;

public class Number 
{
	int		first_number;
	int		second_number;
	double	result;	
	
	public Number(int x, int y)
	{
		this.first_number = x;
		this.second_number = y; 
	}
	
	public void add()
	{
		result = first_number+second_number;
        System.out.println ("Result: "+result);

	}
	public void sub()
	{
		result = first_number-second_number;
        System.out.println ("Result: "+result);

	}
	public void mul()
	{
		result = first_number*second_number;
        System.out.println ("Result: "+result);

	}
	public void div()
	{
		 try{

	         result = first_number/second_number;
	         System.out.println ("Result: "+result);
	        }
	      catch(ArithmeticException e)
		 {
	         System.out.println ("You Shouldn't divide a number by zero");
		
		 }
	
	}
	public static void main(String[] args) {
		Number numbers = new Number(10,-10);
		numbers.add();
		numbers.sub();
		numbers.mul();
		numbers.div();
	}
}
