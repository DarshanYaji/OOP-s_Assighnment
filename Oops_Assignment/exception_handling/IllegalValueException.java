/*Create a class USERTRAIL with following specifications.
 		val1, val2 type    int

Methods
        	
boolean show () will check if val1 and val2 are greater or less than Zero

Have constructor which will val1, val2 and check whether if it is less than 0  then raise a custom Exception (name: Illegal value exception.)
*/
package exception_handling;

public class IllegalValueException extends Exception {

	private static final long serialVersionUID = 1L;

public String toString(){
    return "Illegal Value Exception";
   
}


}