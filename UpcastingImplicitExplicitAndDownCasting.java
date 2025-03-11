package TypeCastingAndPolymorphism07March2025;

// Parent class
	class Parent {
	    void show() {
	        System.out.println("Parent class method");
	    }
	}
// Child class extending Parent
	class Child extends Parent {
	    void display() {
	        System.out.println("Child class method");
	    }
	}
	public class UpcastingImplicitExplicitAndDownCasting {
	public static void main(String[] args) {
        // Implicit Upcasting (Automatically done)
        Parent p1 = new Child(); // Child object assigned to Parent reference
        p1.show();  // Accessing Parent class method
        // Explicit Upcasting (Manually done)
        Parent p2 = (Parent) new Child(); // Explicitly casting Child to Parent
        p2.show();  // Accessing Parent class method
        // Downcasting (Explicit)
        if (p2 instanceof Child) { // Checking type before downcasting
            Child c1 = (Child) p2; // Casting Parent reference back to Child
            c1.display();  // Accessing Child class method
        } else {
            System.out.println("Downcasting not possible");
        }

        // Example of invalid downcasting (Throws Exception)
        Parent p3 = new Parent(); // Parent object
        if (p3 instanceof Child) {
            Child c2 = (Child) p3; // Unsafe downcasting (will fail)
            c2.display();
        } else {
            System.out.println("Downcasting not allowed for Parent object");}
        }
}
