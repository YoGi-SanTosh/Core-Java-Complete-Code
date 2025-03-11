package TypeCastingAndPolymorphism07March2025;

class MathOperations {
    // Method with two integer parameters
    int add(int a, int b) {
        return a + b;
    }
    
    // Method with three integer parameters (Overloaded)
    int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method with two double parameters (Overloaded)
    double add(double a, double b) {
        return a + b;
    }
    
    // Method with a string and an integer (Overloaded)
    String add(String a, int b) {
        return a + b;
    }
}

public class PolimorphismMethodOverriding {
	

	public static void main(String[] args) {
        MathOperations obj = new MathOperations();
        
        // Calling different overloaded methods
        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
        System.out.println("Sum of two doubles: " + obj.add(5.5, 2.5));
        System.out.println("Concatenation of string and integer: " + obj.add("Number: ", 100));
    }
}
