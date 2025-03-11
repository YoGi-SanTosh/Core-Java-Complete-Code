package StringAndArrayConcept20Feb2025;

public class StringBufferUsingAppendInsertDeleteSubstringReverseCapacityReplace {

	public static void main(String[] args) {
		// Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");  
        // Append
        sb.append(" World");
        System.out.println("After append: " + sb); 
        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);
        // Delete
        sb.delete(5, 10); // Removes " Java"
        System.out.println("After delete: " + sb); 
        // Substring
        String sub = sb.substring(6, 11);
        System.out.println("Substring (6-11): " + sub);
        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
        // Capacity
        System.out.println("Capacity: " + sb.capacity()); 
        // Replace
        sb.reverse(); // Reverse back to original
        sb.replace(6, 11, "Universe");
        System.out.println("After replace: " + sb);
        // Ensure Capacity
        sb.ensureCapacity(50);
        System.out.println("Capacity after ensureCapacity(50): " + sb.capacity());
	}
}
