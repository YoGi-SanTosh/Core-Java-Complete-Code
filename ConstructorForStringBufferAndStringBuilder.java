package StringAndArrayConcept20Feb2025;

public class ConstructorForStringBufferAndStringBuilder {

	public static void main(String[] args) {
        // StringBuffer Constructors
        System.out.println("StringBuffer Constructors:");
        StringBuffer sb1 = new StringBuffer(); // Default constructor
        System.out.println("Default: " + sb1);
        
        StringBuffer sb2 = new StringBuffer("Hello"); // String constructor
        System.out.println("String: " + sb2);
        
        StringBuffer sb3 = new StringBuffer(20); // Capacity constructor
        System.out.println("Capacity: " + sb3.capacity());
        
        // StringBuilder Constructors
        System.out.println("\nStringBuilder Constructors:");
        StringBuilder sb4 = new StringBuilder(); // Default constructor
        System.out.println("Default: " + sb4);
        
        StringBuilder sb5 = new StringBuilder("World"); // String constructor
        System.out.println("String: " + sb5);
        
        StringBuilder sb6 = new StringBuilder(30); // Capacity constructor
        System.out.println("Capacity: " + sb6.capacity());
	}

}
