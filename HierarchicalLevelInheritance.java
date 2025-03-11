package InheritanceConceptInJava30Jan25;
//Parent class (Fruit)
class Fruit
{
 void taste() 
 {
     System.out.println("Fruits are delicious");
 }
}
//Child class 1 (Apple)
class Apple extends Fruit 
{
 void color() 
 {
     System.out.println("Apple is red");
 }
}
//Child class 2 (Banana)
class Banana extends Fruit 
{
 void shape() 
 {
     System.out.println("Banana is long and curved");
 }
}
public class HierarchicalLevelInheritance 
 {
 public static void main(String[] args) 
 {
     // Creating objects of Apple and Banana classes
     Apple apple = new Apple();
     Banana banana = new Banana();
     // Calling methods from Fruit, Apple, and Banana classes
     apple.taste();  // Inherited from Fruit class
     apple.color();  // Defined in Apple class
     banana.taste(); // Inherited from Fruit class
     banana.shape(); // Defined in Banana class
 }
}
