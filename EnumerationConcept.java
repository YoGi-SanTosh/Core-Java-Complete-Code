package CollectionConcept03March25;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationConcept {

	public static void main(String[] args) {
        // Create a Vector to store elements
        Vector<String> names = new Vector<>();
        
        // Adding elements to the Vector
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");
        names.add("Eve");
        
        // Getting Enumeration object to traverse the Vector
        Enumeration<String> enumeration = names.elements();
        
        System.out.println("Elements in Vector:");
        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
 
	}

}
