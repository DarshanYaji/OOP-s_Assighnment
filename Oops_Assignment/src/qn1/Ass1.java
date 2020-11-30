/*Create an abstract class Instrument which is having the abstract function play.
Create three more sub classes from Instrument which is Piano, Flute, Guitar.
Override the play method inside all three classes printing a message
“Piano is playing tan tan tan tan ” for Piano class
“Flute is playing toot toot toot toot” for Flute class
“Guitar is playing tin tin tin ” for Guitar class
You must not allow the user to declare an object of Instrument class.
Create an array of 10 Instruments.
Assign different type of instrument to Instrument reference.
Check for the polymorphic behavior of play method.
Use the instanceof operator to print that which object stored at which index of instrument
array.*/


package qn1;


public class Ass1 {

	public static void main(String[] args) {
Instrument[] instruments = new Instrument[10];
		
	    		
	    	for (int i=0;i<3;i++)
	    	{
	    		instruments[0] = new Piano();

	    		instruments[1] = new Flute();

	    		instruments[2] = new Guitar();
	    	
	    	instruments[i].play();
	    }
		    for (int i1 = 0; i1 < 10; i1++) {
		    	if (instruments[i1] instanceof Piano) 
		    		System.out.println("Piano is stored at index " + i1);
		    	else if (instruments[i1] instanceof Flute) 
		    		System.out.println("Flute is stored at index " + i1);
		    	else if (instruments[i1] instanceof Guitar) 
		    		System.out.println("Guitar is stored at index " + i1);
		    }
	    

	    }

	}
	


