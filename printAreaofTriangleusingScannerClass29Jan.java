package LearnLoopForWhileDoWhileForEach28Jan25;
	import java.util.Scanner;
public class printAreaofTriangleusingScannerClass29Jan {

	public static void main(String[] args) {

		// Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        // Prompt the user for the height of the triangle
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the result
        System.out.println("The area of the triangle is: " + area);

        // Close the Scanner
        scanner.close();
    
		
		
	}

}
