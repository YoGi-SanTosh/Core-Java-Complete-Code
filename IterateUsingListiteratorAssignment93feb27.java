package CollectionConcept27feb25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateUsingListiteratorAssignment93feb27 {

	public static void main(String[] args) {
		List<Object> l1= new  ArrayList<Object>(); 
		l1.add(50);
		l1.add(52.36);
		l1.add(45626);
		l1.add("A");
		l1.add(null);
		l1.add(null);

	System.out.println(l1);
	
	Iterator l2=l1.iterator();
	
	while (l2.hasNext())
	{
		System.out.println(l2.next());
	}

	}
}
