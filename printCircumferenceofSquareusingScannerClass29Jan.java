package LearnLoopForWhileDoWhileForEach28Jan25;
	import java.util.Scanner;
public class printCircumferenceofSquareusingScannerClass29Jan {

	public static void main(String[] args) 
	{

        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the side length of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        
        // Calculate the circumference of the square
        double circumference = 4 * side;
        
        // Print the result
        System.out.println("The circumference of the square is: " + circumference);
        
        // Close the scanner
        scanner.close();
    

	}

}
