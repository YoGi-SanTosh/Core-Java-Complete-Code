package InheritanceConceptInJava30Jan25;

//Define the interface with two abstract methods
interface Shape {
 // Abstract method to calculate area
 double calculateArea();
 
 // Abstract method to calculate perimeter
 double calculatePerimeter();
}

//Implement the Shape interface in a class for a circle
class Circle implements Shape {
 private double radius;

 // Constructor to initialize radius
 public Circle(double radius) {
     this.radius = radius;
 }

 // Implement the calculateArea method
 public double calculateArea() {
     return Math.PI * radius * radius; // Area of circle = π * r^2
 }

 // Implement the calculatePerimeter method
 public double calculatePerimeter() {
     return 2 * Math.PI * radius; // Perimeter (circumference) = 2 * π * r
 }
}

//Implement the Shape interface in a class for a rectangle
class Rectangle implements Shape {
 private double length, width;

 // Constructor to initialize length and width
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }

 // Implement the calculateArea method
 public double calculateArea() {
     return length * width; // Area of rectangle = length * width
 }

 // Implement the calculatePerimeter method
 public double calculatePerimeter() {
     return 2 * (length + width); // Perimeter of rectangle = 2 * (l + w)
 }
}
//Main class to test the implementation
public class Interface2Abstractmethod07Feb25 {
 public static void main(String[] args) {
     // Create a Circle object
     Shape circle = new Circle(5.0);
     System.out.println("Circle Area: " + circle.calculateArea());
     System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

     // Create a Rectangle object
     Shape rectangle = new Rectangle(4.0, 6.0);
     System.out.println("Rectangle Area: " + rectangle.calculateArea());
     System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
 }
}


