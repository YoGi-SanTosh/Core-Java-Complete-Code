package InheritanceConceptInJava30Jan25;

//Parent class (superclass)
class New {
 // Parameterized constructor of New class
 New(String name, int age) {
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
 }
}

//Child class (subclass) that extends New class
class Dogi extends New {
 // Constructor of Dog class
 Dogi(String name, int age) {
     // Calling the parent class (New) constructor with parameters using super()
     super(name, age);
     System.out.println("This is a Dog");
 }
}

public class ParameterizedConstructorSuperCallingStatement 
{
 public static void main(String[] args)
 {
     // Creating an instance of Dog class and passing arguments to the constructor
     Dogi dog = new Dogi("Buddy", 5);
 }

	
}
