package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;

public class WAPOnMapUsingItsAllMethod05March25 {

	public static void main(String[] args) {
		// Creating a HashMap
        Map<Integer, String> map1 = new HashMap<>();
        
        // Adding elements using put()
        map1.put(1, "Apple");
        map1.put(2, "Banana");
        map1.put(3, "Cherry");

        // Using get() method
        System.out.println("Value for key 2: " + map1.get(2));
        
        // Using containsKey() method
        System.out.println("Does key 3 exist? " + map1.containsKey(3));
        
        // Using containsValue() method
        System.out.println("Does value 'Apple' exist? " + map1.containsValue("Apple"));
        
        // Using putIfAbsent() method
        map1.putIfAbsent(2, "Blueberry"); // Won't update since key 2 exists
        map1.putIfAbsent(4, "Date"); // Adds a new entry since key 4 is absent
        System.out.println("Updated Map: " + map1);
        
        // Creating another map to compare equality
        Map<Integer, String> map2 = new HashMap<>(map1);
        System.out.println("Are map1 and map2 equal? " + map1.equals(map2));
        
        // Modifying map2 and checking equality again
        map2.put(5, "Elderberry");
        System.out.println("Are map1 and modified map2 equal? " + map1.equals(map2));

	}

}
