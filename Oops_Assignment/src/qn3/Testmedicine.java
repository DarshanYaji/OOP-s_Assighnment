/*Create a class Medicine to represent a drug manufactured by a pharmaceutical company.
Provide a function displayLabel() in this class to print Name and address of the company.
Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the
displayLabel() function in each of these classes to print additional information suitable to the
type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in
case of ointments it could be “for external use only” etc.
Create a class TestMedicine . Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer in the range
1 to 3.
Refer Java API Documentation to find out random generation feature.
Check the polymorphic behavior of the displayLabel() method*/

package qn3;

import java.util.*;

public class Testmedicine 
{

	public static void main(String[] args) 
	{
		//an array of Medicine references of size 10
		Medicine obj[] = new Medicine[10];
		
		//For Generating Random no
		Random rand = new Random();
		
		for(int i=0;i<10;i++) 
		{
/* a temprovary variable called as r to store the random number 
it generates at that point they have mentioned randomly generated integer 
in the range 1 to 3 so (3) and +1 bcz you have to
get random numbers from 1 not 0	*/
		int r= 1 + rand.nextInt(3); 
		if (r == 1)
	   		obj[i] = new Tablet();
	    else if (r == 2)
	   		obj[i] = new Ointment();
	   	else if (r == 3)
	   		obj[i] = new Syrup();
	
		obj[i].displayLabel();

	
		}

	}
	
}
