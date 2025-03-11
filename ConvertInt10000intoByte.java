package TypeCastingAndPolymorphism07March2025;

public class ConvertInt10000intoByte {

	public static void main(String[] args) {
		
        int num = 10000;
        byte convertedByte = (byte) num; // Explicit type casting

        System.out.println("Original int value: " + num);
        
        System.out.println("Converted byte value: " + convertedByte);
    }

}
