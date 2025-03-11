package LearnLoopForWhileDoWhileForEach28Jan25;
	import java.util.Scanner;
public class printAreaofSquareusingScannerClass29Jan {

	public static void main(String[] args)
	
	{
		
		// Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate the area of the square
        double area = side * side;

        // Print the result
        System.out.println("The area of the square is: " + area);

        // Close the scanner
        scanner.close();
    }
	

}
