package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMapUsingIterator {

	public static void main(String[] args) {
		// Creating a Map
        Map<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        // Getting an Iterator
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        // Iterating over the Map
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
