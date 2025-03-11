package LearnLoopForWhileDoWhileForEach28Jan25;

import java.util.Scanner;
public class PrintAreaOfCircleUsingScannerClass29Jan {

	public static void main(String[] args) 
	{

		// Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate the area of the circle
        double area = Math.PI * radius * radius;

        // Display the result
        System.out.println("The area of the circle is: " + area);

        // Close the scanner
        scanner.close();
 
		
		
		
	}

}
