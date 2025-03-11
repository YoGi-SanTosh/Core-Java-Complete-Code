package CollectionConcept27feb25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortListAndSetIntegerStringAssignment97Feb27 {

	public static void main(String[] args) {

        // Sorting a List
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 4));
        System.out.println("Original List: " + list);
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Sorting a Set (Converting HashSet to List first)
        Set<Integer> set = new HashSet<>(Arrays.asList(7, 3, 9, 2, 6));
        System.out.println("\nOriginal Set: " + set);

        List<Integer> sortedSetList = new ArrayList<>(set);
        Collections.sort(sortedSetList);
        System.out.println("Sorted Set as List: " + sortedSetList);
      
        
        List<String> setS1 = new ArrayList<String>();
        setS1.add("Santosh"); 
        setS1.add("swati");        
        setS1.add("Madhuri");        
        setS1.add("spna");        
        setS1.add("bhuvaneshwari");        
        setS1.add(0,"Swipnil");
        System.out.println("\nBefore Sorting" + setS1);
        Collections.sort(setS1);
        System.out.println("\nAfter sorting" + setS1);
	}

}
