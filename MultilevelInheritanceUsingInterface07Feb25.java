package InheritanceConceptInJava30Jan25;
//First Interface - Animal
interface AnimalIF {
 // Abstract method to make a sound
 void sound();}
//Second Interface - Mammal (inherits from Animal interface)
interface Mammal extends AnimalIF {
 // Abstract method for giving birth
 void giveBirth();}
//Third Interface - Dog (inherits from Mammal interface)
interface DogAB extends Mammal {
 // Abstract method for barking
 void bark();}
//Class implementing the Dog interface, which implicitly implements Mammal and Animal interfaces
class GermanShepherd implements DogAB {
 // Implementing sound() from Animal interface
 public void sound() {
     System.out.println("German Shepherd makes a sound: Woof Woof");}
 // Implementing giveBirth() from Mammal interface
 public void giveBirth() {
     System.out.println("German Shepherd gives birth to puppies.");}
 // Implementing bark() from Dog interface
 public void bark() {
     System.out.println("German Shepherd barks loudly.");
 }}
//Main class to test multi-level inheritance
public class MultilevelInheritanceUsingInterface07Feb25 {
 public static void main(String[] args) {
     // Creating an object of the GermanShepherd class
     GermanShepherd shepherd = new GermanShepherd();
      // Calling methods from the interfaces
     shepherd.sound();        // From Animal interface
     shepherd.giveBirth();    // From Mammal interface
     shepherd.bark();         // From Dog interface
 }
}
