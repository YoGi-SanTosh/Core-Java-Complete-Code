package InheritanceConceptInJava30Jan25;
//Abstract class
abstract class Animal1 {
 // Abstract method (does not have a body)
 abstract void sound();
 // Regular method
 void sleep() {
     System.out.println("This animal is sleeping.");
 }
}
//Subclass (inherited from Animal)
class Dog1 extends Animal1 {
 // Providing the implementation of the abstract method
 void sound() {
     System.out.println("The dog barks.");
 }
}
//Another subclass (inherited from Animal)
class Cat extends Animal1 {
 // Providing the implementation of the abstract method
 void sound() {
     System.out.println("The cat meows.");
 }
}
public class AbstractClassAbstractMethod {
	public static void main(String[] args) {
     // Creating objects of the subclasses
     Animal1 myDog = new Dog1();
     Animal1 myCat = new Cat();
     // Calling methods from subclasses
     myDog.sound(); // Output: The dog barks.
     myDog.sleep(); // Output: This animal is sleeping.
     myCat.sound(); // Output: The cat meows.
     myCat.sleep(); // Output: This animal is sleeping.
 }

}
