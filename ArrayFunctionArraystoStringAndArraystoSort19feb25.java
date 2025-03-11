package StringConcept14Feb2025;

import java.util.Arrays;

public class ArrayFunctionArraystoStringAndArraystoSort19feb25 
{
    // Method to sort an array and return it as a string
    public static String sortAndConvertToString(int[] arr) 
    
    {
        Arrays.sort(arr); // Sorting the array
        return Arrays.toString(arr); // Converting sorted array to string
    }
    
	    
	    public static void main(String[] args)
	    {
	        int[] numbers = {5, 2, 8, 1, 3};
	        
	        System.out.println("Original Array: " + Arrays.toString(numbers));
	        
	        String sortedArrayString = sortAndConvertToString(numbers);
	        System.out.println("Sorted Array: " + sortedArrayString);
	    
	}

}
