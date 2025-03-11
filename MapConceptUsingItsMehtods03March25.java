package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;

public class MapConceptUsingItsMehtods03March25 {
	public static void main(String[] args) {
		Map<Integer, String>m1 =new HashMap<Integer, String>();
		m1.put(123456, "santosh");
		m1.put(256314, "shiwani");
		m1.put(562314, "sapna");
		m1.put(987654, "kajal");
		m1.put(529630, "tarun");
		System.out.println(m1);
	Map<Integer, String>m2 =new HashMap<Integer, String>();
		m2.put(777777, "ravi");
		m2.put(666666, "shally");
		m2.put(562314, "sapna");
		m2.put(987654, "kajal");
		m2.put(529630, "tarun");
		m2.putAll(m1);
		m2.replace(562314, "khushboo");
		m2.remove(529630);
		m2.clear();
		System.out.println(m2);
		boolean b1=m2.isEmpty();
		System.out.println(b1);
		System.out.println(m2);
	}

}
