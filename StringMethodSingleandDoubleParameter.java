package StringAndArrayConcept20Feb2025;

public class StringMethodSingleandDoubleParameter {

	public static void main(String[] args) {
		// Sample String
        String str = "Hello, World!";
        
        // Single Parameter String Methods
        System.out.println("Original String: " + str);
        System.out.println("Length: " + str.length()); // length()
        System.out.println("Lowercase: " + str.toLowerCase()); // toLowerCase()
        System.out.println("Uppercase: " + str.toUpperCase()); // toUpperCase()
        System.out.println("Character at index 7: " + str.charAt(7)); // charAt(int index)
        System.out.println("Substring from index 7: " + str.substring(7)); // substring(int beginIndex)
        System.out.println("Trimmed: " + "  Hello  ".trim()); // trim()

        // Double Parameter String Methods
        System.out.println("Substring (index 7 to 12): " + str.substring(7, 12)); // substring(int begin, int end)
        System.out.println("Replace 'o' with 'x': " + str.replace('o', 'x')); // replace(char oldChar, char newChar)
        System.out.println("Index of 'o': " + str.indexOf('o')); // indexOf(char ch)
        System.out.println("Index of 'o' after index 5: " + str.indexOf('o', 5)); // indexOf(char ch, int fromIndex)
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java")); // replace(CharSequence target, CharSequence replacement)
    
	}

}
