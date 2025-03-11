package InheritanceConceptInJava30Jan25;
//Abstract class
abstract class Vegetable {
 // Abstract method (does not have a body)
 abstract void prepare();
 abstract void santosh();
 // Concrete method (has a body)
 void wash() {
     System.out.println("The vegetable is being washed.");}
}
//Subclass (inherited from Vegetable)
class Carrot extends Vegetable {
 // Providing the implementation of the abstract method
 void prepare() {
     System.out.println("The carrot is peeled and sliced.");}
void santosh() {
	// TODO Auto-generated method stub	
}
}
//Another subclass (inherited from Vegetable)
class Potato extends Vegetable {
 // Providing the implementation of the abstract method
 void prepare() {
     System.out.println("The potato is peeled and chopped.");}
void santosh() {
	// TODO Auto-generated method stub
	}
}
public class AbstractClassAbstractMethodConcereteClass {
	public static void main(String[] args) {
     // Creating objects of the subclasses
     Vegetable carrot = new Carrot();
     Vegetable potato = new Potato();
     // Calling methods from subclasses
     carrot.prepare();  // Output: The carrot is peeled and sliced.
     carrot.wash();     // Output: The vegetable is being washed.
     potato.prepare();  // Output: The potato is peeled and chopped.
     potato.wash();     // Output: The vegetable is being washed.
 }
}
