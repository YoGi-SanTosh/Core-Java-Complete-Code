package CollectionConcept27feb25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateUsingListiteratorHasNextHasPreviousAssignment94feb27 {

	public static void main(String[] args) {
		List<String> l1= new  ArrayList<String>(); 
		l1.add("swati");
		l1.add("Madhuri");
		l1.add("swapna");
		l1.add("richa patwa");
		l1.add("shally");
		l1.add("Yogi");
		l1.add(0,"Pallavi");
	System.out.println(l1);
	System.out.println("Iteration  Starting");
	
	Iterator<String> l2= l1.iterator();

	while (l2.hasNext())
	{
		System.out.println(l2.next());
	}
System.out.println("ListIteration Starting");
	ListIterator<String> l3 = l1.listIterator();
	//Next / Previous / hasNext / hasPrevious / Set
System.out.println("Forward iteration");
	while (l3.hasNext())
	{
		System.out.println(l3.next());
	}
System.out.println("Backword iteration");
	while(l3.hasPrevious())
	{
		System.out.println(l3.previous());
	}
	}
}
