package InheritanceConceptInJava30Jan25;

import java.lang.foreign.AddressLayout;

class ParentsClass
{
	int a=10;
	int b=20;
	int sum=a+b;
	static void add()
	
	{
		
		System.out.println("");
	}
	
}

public class StudentsClass extends ParentsClass

{
	
	static void sub()
	{
		System.out.println("Inherit Class");
	}

	public static void main(String[] args) {
		
	add();
	sub();
		
	}

}
