package StringAndArrayConcept20Feb2025;

public class StringFunctioinReplaceMethodReplaceAllMatchAndRepeat {
	public static void main(String[] args) {
		String name ="School name is abc";
		String n1= name.replace('m', 'a');
		System.out.println(n1);
		
		String name1 ="School name is abc";
		String n2= name.replace("abc", "MKT");
		System.out.println(n2);
		
	String name2 ="Santosh Kumar Jogi 12";
	String s1= name2.replaceAll("[A-Z]", "");
	System.out.println(s1);
	String s2= name2.replaceAll("[a-z]", "");
	System.out.println(s2);

	String name3 ="kv no 214 bangalore" ;
	System.out.println(name3.replaceAll("[0-9]", ""));
	
	String a="allan";
	boolean b1=a.matches("....");
	System.out.println(b1);
	//String end with n
	boolean b2=a.matches("(.)*n");//(.)* represent multi char
	System.err.println(b2);
	//String end with n
	boolean b3=a.matches("a(.)*");//(.)* represent multi char
	System.err.println(b3);
	//check given string have man in it
	String b="spiderman";
	boolean b4=b.matches("(.)*man(.)*");//(.)* represent multi char
	System.err.println(b4);
	}
}
