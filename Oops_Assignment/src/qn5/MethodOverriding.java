/*Create a class Car which contains members speed, noOfGear. The class has a method drive()
which is responsible to provide starting speed and noOfGears to a Car. Implement display()
method which will display all attributes of Car class.
The class SportCar is derived from the class Car which adds new features AirBallonType.
When this method is invoked, initial speed and gear status must be displayed on console.
Override the display method which display all attribute of the SportCar. Make use of super
class display() method.*/

package qn5;

import java.lang.*;

class car

{

int speed,noofgear;

void speed()

{

speed=300;

noofgear=5;

}

void display()

{

System.out.println("Starting speed of a Car is:"+speed);

System.out.println("no of gear in the car is:"+noofgear);

}

}

class sportscar extends car

{

int initspeed,gearstatus;

public void airballontype()

{

initspeed=120;

gearstatus=1;

}

void display()

{ 

super.display();

System.out.println("Starting speed of a SPORTS Car is:"+initspeed);

System.out.println("no of gear in the SPORTS car is:"+gearstatus); 

}

}

class MethodOverriding{

public static void main(String ar[])

{

sportscar sp=new sportscar();

sp.speed();

sp.airballontype();

sp.display();

}

}