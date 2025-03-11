package InheritanceConceptInJava30Jan25;

	class Person {
	    String name;
	    int age;

	    // Non-parameterized constructor
	    Person() {
	        System.out.println("Default constructor called");
	        this.name = "Unknown";
	        this.age = 0;
	    }

	    // Parameterized constructor
	    Person(String name, int age) {
	        // Calling the non-parameterized constructor using 'this()'
	        this();  // Calls the default constructor
	        this.name = name;  // Sets the name
	        this.age = age;  // Sets the age
	        System.out.println("Parameterized constructor called");
	    }

	    void displayInfo() {
	        System.out.println("Name: " + this.name);
	        System.out.println("Age: " + this.age);
	    }
	}

	public class ThisCallingStatement{
	    public static void main(String[] args) 
	    {
	        // Creating an object using the parameterized constructor
	        Person person = new Person("John", 25);
	        
	        // Display the information
	        person.displayInfo();
	    }
	}

