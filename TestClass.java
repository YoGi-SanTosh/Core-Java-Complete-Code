package Pacakge210Feb2025;

import Package110Feb2025.MyClass;

public class TestClass {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        // Accessing public method from outside the package
        myClass.publicMethod(); // This will work

        // Accessing default method (will cause compile-time error)
        // myClass.defaultMethod(); // This will NOT work because it's in a different package

        // Accessing private method (will cause compile-time error)
        // myClass.privateMethod(); // This will NOT work because it's private to MyClass

        // Accessing protected method (will cause compile-time error)
        // myClass.protectedMethod(); // This will NOT work directly in a different package
    }
}
