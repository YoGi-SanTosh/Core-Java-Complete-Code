package Package110Feb2025;
// Define a class with different access specifiers for methods
public class ExampleClassFor58 {
	    // Public method - accessible from anywhere
	    public void publicMethod() {
	        System.out.println("This is a public method.");
	    }
// Private method - accessible only within this class
	    private void privateMethod() {
	        System.out.println("This is a private method.");
	    }
 // Protected method - accessible within the same package or subclasses
	    protected void protectedMethod() {
	        System.out.println("This is a protected method.");
	    }
 // Default method (no access specifier) - accessible within the same package
	    void defaultMethod() {
	        System.out.println("This is a default access method.");
	    }

public static void main(String[] args) {

	    	ExampleClassFor58 example = new ExampleClassFor58();

	        // Accessing methods
	        example.publicMethod();  // Allowed: public method can be accessed anywhere
	        // example.privateMethod(); // Error: privateMethod is not accessible outside ExampleClass
	        example.protectedMethod();  // Allowed: protected method can be accessed within the same package
	        example.defaultMethod();  // Allowed: default method can be accessed within the same package
	    }
}
