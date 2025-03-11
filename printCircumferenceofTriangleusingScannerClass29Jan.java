package LearnLoopForWhileDoWhileForEach28Jan25;
	import java.util.Scanner;
public class printCircumferenceofTriangleusingScannerClass29Jan {
	public static void main(String[] args)
	{
		
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the lengths of the three sides
        System.out.print("Enter the length of side 1: ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 2: ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the length of side 3: ");
        double side3 = scanner.nextDouble();
        
        // Calculate the circumference (perimeter)
        double circumference = side1 + side2 + side3;
        
        // Print the result
        System.out.println("The circumference of the triangle is: " + circumference);
        
        // Close the scanner
        scanner.close();
    

	}

}
