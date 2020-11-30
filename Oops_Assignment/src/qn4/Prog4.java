/*Write a program that accepts two numbers and a operator like (+,-,*, /) as command line
arguments and perform the appropriate operation indicated by operator.
If the user enters any other character the appropriate message will be displayed. The output
of the program should be displayed to the user.*/
package qn4;
import java.util.*;
public class Prog4
{

    public static void main(String[] args)
    {
    	Scanner s = new Scanner(System.in);


            int a=s.nextInt();
            char p=s.next().charAt(0);
            int b=s.nextInt();

            switch(p)
            {
                case '+':
                    System.out.println("Addition of "+a+" and "+b+" : "+(a+b));
                    break;

                case '-':
                    System.out.println("Subtraction of "+a+" and "+b+" : "+(a-b));
                    break;

                case '*':
                    System.out.println("Multiplication of "+a+" and "+b+" : "+(a*b));
                    break;

                case '/':
                    System.out.println("Division of "+a+" and "+b+" : "+(a/b));
                    break;

                case '%':
                    System.out.println("Modulo of "+a+" and "+b+" : "+(a%b));
                    break;


                default:
                    System.out.println("Please Enter '+', '-', '*', '/' & '%' operator only.");
            }
            }

        }

    