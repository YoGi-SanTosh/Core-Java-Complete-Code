package InheritanceConceptInJava30Jan25;

//Base class (Grandparent)
class Vehicle 
{
 void start() 
 {
     System.out.println("Vehicle is starting");
 }
}

//Derived class (Parent)
class Car extends Vehicle
{
 void drive() 
 {
     System.out.println("Car is driving");
 }
}

//Derived class (Child)
class SportsCar extends Car {
 void speed() {
     System.out.println("Sports car is going fast");
 }
     
}

public class MultiLevelInheritance
	{
		public static void main(String[] args) 
		{
// Creating an object of the SportsCar class
     SportsCar sportsCar = new SportsCar();
     
 // Calling methods from Vehicle, Car, and SportsCar classes
     sportsCar.start();  // Inherited from Vehicle class
     sportsCar.drive();  // Inherited from Car class
     sportsCar.speed();  // Defined in SportsCar class
 }
}

