package TypeCastingAndPolymorphism07March2025;

public class ConvertShortIntoByte {

	public static void main(String[] args) {

		short shortValue = 150; // Example short value
        byte byteValue = (byte) shortValue; // Explicit casting from short to byte

        System.out.println("Short value: " + shortValue);
        
        System.out.println("Converted byte value: " + byteValue);
    
	}

}
