package InterfaceLearning10feb2025;
import java.util.Scanner;

		public class Calculator4NumberTakeInput {
		    public static void main(String[] args) {
		        // Create a Scanner object to take user input
		        Scanner scanner = new Scanner(System.in);

		        // Prompt user to enter four numbers
		        System.out.print("Enter the first number: ");
		        double num1 = scanner.nextDouble();
		        
		        System.out.print("Enter the second number: ");
		        double num2 = scanner.nextDouble();

		        System.out.print("Enter the third number: ");
		        double num3 = scanner.nextDouble();

		        System.out.print("Enter the fourth number: ");
		        double num4 = scanner.nextDouble();

		        // Calculate the sum
		        double sum = num1 + num2 + num3 + num4;

		        // Display the result
		        System.out.println("The sum of the four numbers is: " + sum);

		        // Close the scanner to prevent memory leaks
		        scanner.close();
		    }
		
		}
	
