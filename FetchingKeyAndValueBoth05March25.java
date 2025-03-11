package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;

public class FetchingKeyAndValueBoth05March25 {

	public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();

        // Adding key-value pairs to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(4, "Orange");
        map.put(5, "Mango");
        map.put(6, "Gwava");


        // Iterating over the map using entrySet()
        System.out.println("Key-Value pairs in the Map:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

	}

}
