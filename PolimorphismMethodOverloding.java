package TypeCastingAndPolymorphism07March2025;
//Parent class
class Animal {
 void makeSound() {
     System.out.println("Animal makes a sound");
 }
}
//Child class 1
class Dog extends Animal {
 @Override
 void makeSound() {
     System.out.println("Dog barks");
 }
}
//Child class 2
class Cat extends Animal {
 @Override
 void makeSound() {
     System.out.println("Cat meows");
 }
}
public class PolimorphismMethodOverloding {

	public static void main(String[] args) {
        Animal myAnimal; // Reference of parent class
        myAnimal = new Dog(); // Dog object assigned
        myAnimal.makeSound(); // Calls Dog's makeSound method

        myAnimal = new Cat(); // Cat object assigned
        myAnimal.makeSound(); // Calls Cat's makeSound method
    }
}
