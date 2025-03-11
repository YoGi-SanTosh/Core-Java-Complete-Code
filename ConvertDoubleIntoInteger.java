package TypeCastingAndPolymorphism07March2025;

public class ConvertDoubleIntoInteger {

	public static void main(String[] args) {

		        int num = 5000;  // Integer value
		        
		        // Implicit conversion (Widening)
		        double doubleValue = num;
		        
		        // Explicit conversion using type casting
		        
		        double explicitDouble = (double) num;
		        
		        System.out.println("Implicit Conversion: " + doubleValue);
		        
		        System.out.println("Explicit Conversion: " + explicitDouble);
		        
		        int c=(int) 3.14;
		        System.out.println(c);
		    }

}
