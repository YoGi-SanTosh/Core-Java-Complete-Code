package InterfaceLearning10feb2025;
import java.util.Scanner;

		public class AllowVoteAge18AndFemale {
		    public static void main(String[] args) {
		        // Create a Scanner object to read input from the user
		        Scanner scanner = new Scanner(System.in);
		        // Ask for the user's age
		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();

		        // Ask for the user's gender
		        System.out.print("Enter your gender (female/male): ");
		        String gender = scanner.next().toLowerCase(); // Convert input to lowercase for case-insensitivity

		        // Check if both conditions are satisfied
		        if (age > 18 && gender.equals("female"))
		        {
		            System.out.println("You are eligible to vote.");
		        } 
		        else 
		        {
		            System.out.println("You are not eligible to vote.");
		        }

		        // Close the scanner to prevent resource leak
		        scanner.close();
		    }
	}

