package TypeCastingAndPolymorphism07March2025;

public class ConvertFloatIntoDouble {

	public static void main(String[] args) {
		// Declare a float variable
        float floatValue = 12.34f; // 'f' suffix indicates a float literal

        // Convert float to double (implicit widening conversion)
        double doubleValue = floatValue;

        // Display the values
        System.out.println("Float value: " + floatValue);
        System.out.println("Converted Double value: " + doubleValue);
    }

}
