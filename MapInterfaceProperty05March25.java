package CollectionConcept03March25;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceProperty05March25 {

	public static void main(String[] args) {
		Map<Integer, String>m1 =new HashMap<Integer, String>();
		m1.put(123456, "santosh");
		m1.put(256314, "shiwani");
		m1.put(562314, "sapna");
		m1.put(987654, "kajal");
		m1.put(529630, "tarun");
		System.out.println(m1);
boolean b1=m1.containsKey(123456);
System.out.println(b1);
boolean b2=m1.containsValue("tarun");
System.out.println(b2);

	}

}
