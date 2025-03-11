package StringAndArrayConcept20Feb2025;

import java.util.ArrayList;
import java.util.Collection;

public class UnderstandingofCollection26feb {

	public static void main(String[] args) {

		Collection a1= new ArrayList();
		a1.add(true);
		a1.add("ram");
		a1.add(15.02);
		a1.add(15821);
		a1.add("B");
		System.out.println(a1);
		
		Collection a2= new ArrayList();
		a2.add("sachin");
		a2.add("santosh");
		a2.addAll(a1);
		System.err.println(a2);
	}
		
}
