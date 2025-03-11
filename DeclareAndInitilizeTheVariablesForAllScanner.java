package MethodAndOperatorOrVariable17Jan2025;
import java.util.Scanner;

public class DeclareAndInitilizeTheVariablesForAllScanner {

	public static void main(String[] args) {
		
		

		{
		        Scanner scanner = new Scanner(System.in);

		        // Integer types
		        System.out.println("Enter a byte value (-128 to 127): ");
		        byte byteVar = scanner.nextByte();

		        System.out.println("Enter a short value (-32768 to 32767): ");
		        short shortVar = scanner.nextShort();

		        System.out.println("Enter an int value (-2147483648 to 2147483647): ");
		        int intVar = scanner.nextInt();

		        System.out.println("Enter a long value (-9223372036854775808 to 9223372036854775807): ");
		        long longVar = scanner.nextLong();

		        // Floating-point types
		        System.out.println("Enter a float value (e.g., 3.14): ");
		        float floatVar = scanner.nextFloat();

		        System.out.println("Enter a double value (e.g., 3.141592653589793): ");
		        double doubleVar = scanner.nextDouble();

		        // Character type
		        System.out.println("Enter a single character: ");
		        char charVar = scanner.next().charAt(0);

		        // Boolean type
		        System.out.println("Enter a boolean value (true or false): ");
		        boolean booleanVar = scanner.nextBoolean();

		        // Display the values of the variables
		        System.out.println("You entered the following values\n:");
		        System.out.println("Byte Value: " + byteVar);
		        System.out.println("Short Value: " + shortVar);
		        System.out.println("Int Value: " + intVar);
		        System.out.println("Long Value: " + longVar);
		        System.out.println("Float Value: " + floatVar);
		        System.out.println("Double Value: " + doubleVar);
		        System.out.println("Char Value: " + charVar);
		        System.out.println("Boolean Value: " + booleanVar);

		        scanner.close();
		    }
	
	}
}
