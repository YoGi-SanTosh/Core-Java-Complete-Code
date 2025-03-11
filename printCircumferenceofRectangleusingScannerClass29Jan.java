package LearnLoopForWhileDoWhileForEach28Jan25;
	import java.util.Scanner;
public class printCircumferenceofRectangleusingScannerClass29Jan {

	public static void main(String[] args) 
	{

        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the length and width of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();

        // Calculate the circumference
        double circumference = 2 * (length + width);

        // Display the result
        System.out.println("The circumference of the rectangle is: " + circumference);

        // Close the scanner
        scanner.close();
    

	}

}
