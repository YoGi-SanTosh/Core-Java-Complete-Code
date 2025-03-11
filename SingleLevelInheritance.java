package InheritanceConceptInJava30Jan25;

	
	// Parent class
	class Animal 
	{
	    void eat()
	    {
	        System.out.println("Animal is eating");
	    }
	}

	// Child class
	class Dog extends Animal
	{
	    void bark()
	    {
	        System.out.println("Dog is barking");
	    }
	}

	public class SingleLevelInheritance {
		
		public static void main(String[] args) 
	    {
	        // Creating an object of the Dog class
	        Dog dog = new Dog();
	        
	        // Calling methods from both the parent and child classes
	        dog.eat();  // Inherited from Animal class
	        dog.bark(); // Defined in Dog class
	    }
}
