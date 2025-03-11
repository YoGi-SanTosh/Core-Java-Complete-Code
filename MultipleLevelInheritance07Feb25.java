package InheritanceConceptInJava30Jan25;
//First Interface - Animal
interface AnimalABC {
 // Abstract method for making a sound
 void sound();}
//Second Interface - Mammal
interface MammalA {
 // Abstract method for giving birth
 void giveBirth();
}
//Third Interface - Pet
interface Pet {
 // Abstract method for petting the animal
 void pet();}
//Class implementing all the interfaces (Multiple Inheritance)
class DogAAA implements AnimalABC, Mammal, Pet {
	// Implementing the sound method from Animal interface
 public void sound() {
     System.out.println("Dog barks: Woof Woof");
 }
// Implementing the giveBirth method from Mammal interface
 public void giveBirth() {
     System.out.println("Dog gives birth to puppies.");
 }
 // Implementing the pet method from Pet interface
 public void pet() {
     System.out.println("Dog enjoys being petted.");
 }}
//Main class to test multiple inheritance
public class MultipleLevelInheritance07Feb25 {
 public static void main(String[] args) {
     // Create an object of the Dog class
     DogAAA dog = new DogAAA();
     // Call the methods from the implemented interfaces
     dog.sound();      // From Animal interface
     dog.giveBirth();  // From Mammal interface
     dog.pet();        // From Pet interface
 }
}
