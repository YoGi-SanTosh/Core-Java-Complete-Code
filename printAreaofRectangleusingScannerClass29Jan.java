package LearnLoopForWhileDoWhileForEach28Jan25;
	import java.util.Scanner;
public class printAreaofRectangleusingScannerClass29Jan {

	public static void main(String[] args) 
	{

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        
        // Prompt the user to enter the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        
        // Calculate the area of the rectangle
        double area = length * width;
        
        // Print the result
        System.out.println("The area of the rectangle is: " + area);
        
        // Close the scanner
        scanner.close();
    

	}

}
