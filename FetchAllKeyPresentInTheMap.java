package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FetchAllKeyPresentInTheMap {

	public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();
        
        // Adding key-value pairs
        map.put(1, "Orance");
        map.put(2, "Annanas");
        map.put(3, "Mango");
        map.put(4, "Papaya");

        // Fetching all keys
        Set<Integer> keys = map.keySet();

        // Printing all keys
        System.out.println("Keys in the map: " + keys);
    
	}

}
