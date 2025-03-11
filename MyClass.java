package Package110Feb2025;

//Class with different access specifiers
public class MyClass {
 // Public method accessible anywhere
 public void publicMethod() {
     System.out.println("Public method can be accessed anywhere.");
 }

 // Default method, only accessible within the same package
 void defaultMethod() {
     System.out.println("Default method can be accessed within the same package.");
 }

 // Private method, only accessible within this class
 private void privateMethod() {
     System.out.println("Private method can only be accessed within the same class.");
 }

 // Protected method, accessible within the same package or by subclasses
 protected void protectedMethod() {
     System.out.println("Protected method can be accessed within the same package or by subclasses.");
 }
}
