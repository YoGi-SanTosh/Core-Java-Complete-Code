package StringConcept14Feb2025;

public class ArrayIndexoutofbondExceptionExample {

	public static void main(String[] args) 
	{

		 try {
		       int[] numbers = {10, 20, 30, 40, 50};
		       
		        System.out.println("Element at index 5: " + numbers[5]); // Invalid index
		      }
		 catch (ArrayIndexOutOfBoundsException e)
		 {
		       System.out.println("Exception caught: " + e.getMessage());
		   }

		      	System.out.println("Program continues...");
 }
		
}
