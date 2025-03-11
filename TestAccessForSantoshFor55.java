package Pacakge210Feb2025;

public class TestAccessForSantoshFor55 {
	    public static void main(String[] args) {
	    	SantoshFor55 obj = new SantoshFor55();

	        // Accessing public method - Accessible anywhere
	        obj.publicMethod();

	        // Accessing protected method - Accessible within the same package
	        obj.protectedMethod();

	        // Accessing default method - Accessible within the same package
	        obj.defaultMethod();

	        // Accessing private method - This will cause a compile-time error
	        // obj.privateMethod();  // Uncommenting this will give a compile-time error
	    }
}
