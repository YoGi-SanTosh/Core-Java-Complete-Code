package Pacakge210Feb2025;

import Package110Feb2025.ClassA;

public class ClassB {
    public static void main(String[] args) {
        ClassA classA = new ClassA();

        // Accessing public method (can be accessed from anywhere)
        classA.publicMethod();

        // Cannot access private method (private methods are restricted to the class itself)
        // classA.privateMethod(); // This would cause a compilation error

        // Cannot access protected method directly (unless it's in a subclass or same package)
        // classA.protectedMethod(); // This would cause a compilation error

        // Cannot access default method (default methods are restricted to the same package)
        // classA.defaultMethod(); // This would cause a compilation error
    }
}

