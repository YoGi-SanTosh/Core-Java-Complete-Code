package StringAndArrayConcept20Feb2025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
public class CollectionUpcastingConceptwithDifferentDataTypeAndMethod {
// Generic method to perform operations on collections
	    public static <T> void performOperations(Collection<T> collection, T element) {
	        System.out.println("Initial Collection: " + collection);
	        
	        // Add an element
	        collection.add(element);
	        System.out.println("After Adding '" + element + "': " + collection);
	        
	        // Check if element exists
	        boolean contains = collection.contains(element);
	        System.out.println("Contains '" + element + "': " + contains);
	        
	        // Remove an element
	        collection.remove(element);
	        System.out.println("After Removing '" + element + "': " + collection);
	        
	        System.out.println("--------------------------------");
	    }
	    public static void main(String[] args) {
	        // Upcasting different data types to Collection<T>
	        Collection<Integer> intCollection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
	        Collection<Character> charCollection = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
	        Collection<Double> doubleCollection = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3, 4.4));
	        Collection<String> stringCollection = new ArrayList<>(Arrays.asList("Apple", "Banana", "Cherry"));        
	        // Performing operations
	        performOperations(intCollection, 6);
	        performOperations(charCollection, 'E');
	        performOperations(doubleCollection, 5.5);
	        performOperations(stringCollection, "Dragonfruit");
	    }
	}
