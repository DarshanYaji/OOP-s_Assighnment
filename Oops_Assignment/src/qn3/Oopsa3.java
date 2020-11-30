package qn3;

import java.util.Random;
class Medicine1 { //class Medicine to represent a drug manufactured by a company.
	public void  displayLabel(){ // function to print Name and address of the company
		System.out.println("HighPeak");
		System.out.println(" 4, 17th Cross Rd, Siddanna Layout, Banashankari Stage II, Banashankari, Bengaluru, Karnataka 560070");
	}
}
class Tablet1 extends Medicine1{ // subclass tablet from medicine
	public void displayLabel(){
		System.out.println("store in a cool dry place");
	}
}
class Ointment1 extends Medicine1{ //subclass Ointment from medicine
	public void  displayLabel(){
		System.out.println("for external use only");
	}
}
class Syrup1 extends Medicine1{ //subclass Syrup from medicine
        public void  displayLabel(){
                System.out.println("Syrup for dry cough only");
        }
}
class Oopsa3{
	public static void main (String[] args ){
		
		Medicine1 obj[] = new Medicine1[10];//an array of Medicine references of size 10
		Random rand = new Random(); // an object called rand where we can use random numbers
		for(int i=0;i<10;i++) // we want random number's generated 10 times as they have mentioned to create an arry of size 10,a
				// loop that executes 10 times
		{
		int r= 1 + rand.nextInt(3); // a temprovary variable called as r to store the random number it generates at that point
					//they have mentioned randomly generated integer in the range 1 to 3 so (3) and +1 bez you have to
					//get random numbers from 1 not 0
		if (r == 1)
	    		obj[i] = new Tablet1();
	    	else if (r == 2)
	    		obj[i] = new Ointment1();
	    	else if (r == 3)
	    		obj[i] = new Syrup1();
	
			obj[i].displayLabel();
		}
	}
}