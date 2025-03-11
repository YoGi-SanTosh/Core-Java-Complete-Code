package Package110Feb2025;

public class TestAccessSpecifiersForExample {
	    public static void main(String[] args) {
	        // Creating object of Example class
	        Example obj = new Example();

	        // Accessing public variable and method
	        System.out.println(obj.publicVariable); // Accessible
	        obj.publicMethod(); // Accessible

	        // Accessing protected variable and method
	        System.out.println(obj.protectedVariable); // Accessible within the same package
	        obj.protectedMethod(); // Accessible within the same package

	        // Accessing default (package-private) variable and method
	        System.out.println(obj.defaultVariable); // Accessible within the same package
	        obj.defaultMethod(); // Accessible within the same package

	        // Accessing private variable and method
	        // System.out.println(obj.privateVariable); // Error: privateVariable has private access in Example
	        // obj.privateMethod(); // Error: privateMethod() has private access in Example
	    }
}
