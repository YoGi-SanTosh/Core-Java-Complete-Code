package TypeCastingAndPolymorphism07March2025;

public class ConvertShortIntoInteger {

	public static void main(String[] args) {
		short shortValue = 100; // Example short value
        int intValue = shortValue; // Implicit conversion (widening)

        System.out.println("Short Value: " + shortValue);
        System.out.println("Converted Int Value: " + intValue);
    
	}

}
