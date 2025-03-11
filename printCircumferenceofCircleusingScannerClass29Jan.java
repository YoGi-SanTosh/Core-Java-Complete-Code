package LearnLoopForWhileDoWhileForEach28Jan25;
import java.util.Scanner;

public class printCircumferenceofCircleusingScannerClass29Jan {

	public static void main(String[] args) {

		// Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the circumference of the circle
        double circumference = 2 * Math.PI * radius;

        // Print the result
        System.out.println("The circumference of the circle is: " + circumference);

        // Close the scanner
        scanner.close();
    }	
	

}
