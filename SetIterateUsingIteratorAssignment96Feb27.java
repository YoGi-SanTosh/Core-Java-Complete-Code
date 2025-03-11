package CollectionConcept27feb25;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetIterateUsingIteratorAssignment96Feb27 {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(15);
		s1.add(52);
		s1.add(99);
		s1.add(null);
		s1.add(null);
		s1.add(98);
		s1.add(56464);
	System.out.println(s1);
	System.out.println("Iteration Starting");
	Iterator i1= s1.iterator();
		while(i1.hasNext())
	{
		System.out.println(i1.next());
	}
	}

}
