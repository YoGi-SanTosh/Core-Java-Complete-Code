package InterfaceLearning10feb2025;
//Define a class demonstrating different access specifiers for methods
class AccessSpecifiersDemo {
 // Public method - can be accessed from anywhere
 public void publicMethod() {
     System.out.println("This is a public method.");
 }
 // Private method - can be accessed only within this class
 private void privateMethod() {
     System.out.println("This is a private method.");
 }
 // Protected method - can be accessed within the same package or by subclasses
 protected void protectedMethod() {
     System.out.println("This is a protected method.");
 }
 // Default method (no modifier) - can be accessed within the same package
 void defaultMethod() {
     System.out.println("This is a default (package-private) method.");
 }
}
//Another class in the same package to test accessibility
public class AccessspecifierWithinClassMethod {
 public static void main(String[] args) {
     AccessSpecifiersDemo demo = new AccessSpecifiersDemo();
// Accessing public method
     demo.publicMethod(); // Accessible from anywhere
     // Accessing private method - This will cause a compile-time error!
     // demo.privateMethod(); // Error: privateMethod() has private access in AccessSpecifiersDemo
     // Accessing protected method
     demo.protectedMethod(); // Accessible within the same package
          // Accessing default method
     demo.defaultMethod(); // Accessible within the same package
 }
}

