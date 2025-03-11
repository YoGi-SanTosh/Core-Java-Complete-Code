package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;

public class FetchingAllValuePresentinTheMap {

	public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Orance");
        map.put(2, "Annanas");
        map.put(3, "Mango");
        map.put(4, "Papaya");

        // Fetching values using values() method
        System.out.println("Using values() method:");
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Fetching values using entrySet()
        System.out.println("\nUsing entrySet() method:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getValue());
        }

        // Fetching values using lambda expression
        System.out.println("\nUsing forEach() method:");
        map.forEach((key, value) -> System.out.println(value));
    }

}
