package StringAndArrayConcept20Feb2025;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iteratorconcept26feb25 {

	public static void main(String[] args) {

		Collection a1= new ArrayList();//upcasting
		a1.add(true);
		a1.add(60);
		a1.add("RAM");
		a1.add(63.23);
		a1.add(548655);
		System.out.println(a1);
		Iterator i2=a1.iterator();
		
		while (i2.hasNext())
		{
			System.out.println(i2.next());
		}
	}

}
