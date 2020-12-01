/*Create a class called CalcAverage that has the following method:
public double avgFirstN(int N)
This method receives an integer as a parameter and calculates
the average of first N natural numbers.
If N is not a natural number, throw an exception 
IllegalArgumentException with an appropriate message.*/


package exception_handling;

public class CalcAverage 
{
    
    public double avgFirstN(double N)
    {
    	
        if(N<0)
        {
        	
            try
            {
            	
                throw new NumberFormatException();
                
            }
            catch(NumberFormatException nf)
            {
            	
                System.out.println("We must enter the +ve Number");
                
            }
            
        }
        else
        {
            double c=(N+1)/2;
       
        System.out.println("The Average is = "+c);
        }
       
        return N;   
    }
   
public static void main(String[] args) {
       
       
	CalcAverage t=new CalcAverage();
        t.avgFirstN(5.5);   
    }

}
