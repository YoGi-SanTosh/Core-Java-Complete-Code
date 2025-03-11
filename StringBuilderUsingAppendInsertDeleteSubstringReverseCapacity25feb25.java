package StringAndArrayConcept20Feb2025;

public class StringBuilderUsingAppendInsertDeleteSubstringReverseCapacity25feb25 {

	public static void main(String[] args) {
		// Creating a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb);
        // Insert
        sb.insert(6, "Beautiful ");
        System.out.println("After insert: " + sb);  
        // Delete
        sb.delete(6, 16);
        System.out.println("After delete: " + sb); 
        // Substring
        String sub = sb.substring(0, 5);
        System.out.println("Substring: " + sub); 
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        // Capacity
        System.out.println("Capacity: " + sb.capacity());
        // Replace
        sb.reverse(); // Reversing back to original form
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);
    }
}
