package StringAndArrayConcept20Feb2025;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionWrapperMethod26feb {

	public static void main(String[] args) {
		Collection<Integer> a1= new ArrayList<Integer>();
		a1.add(50);
		a1.add(60);
		a1.add(70);
		a1.add(80);
		a1.add(90);
		System.out.println(a1);
		boolean b1= a1.isEmpty();
		System.out.println(b1);
		
		Collection<Integer> a2= new ArrayList<Integer>();
		a2.add(89);
		a2.add(69);
		a2.add(45);
		a2.add(78);
		System.out.println("before removing->" + a2);
		a2.remove(12.36);
		System.out.println("after removing->" + a2);
		
		a2.addAll(a1);
		System.out.println("before removing->" + a2);
		a2.remove(70);
		System.out.println("after removing->" + a2);
		
		boolean b3 =a2.contains(45);
		System.out.println(b3);
		
		boolean b4 =a2.containsAll(a1);
		System.out.println(b4);		
	}

}
