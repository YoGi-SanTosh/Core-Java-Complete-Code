package MethodConstructorOverloadingConcept23Jan2025;

public class MethodOverloadingForStaticMethod {

	static void add(int a,double b)
	{
		System.out.println("this is new static method");
	}
	static void add(double a, int b)
	{

		System.out.println("Overload first add method");
	}
	
	static void add(int c,char a, boolean hi)
	{
		System.out.println("overload second add method");
	}
	
	
	
	public static void main(String[] args) {
		
		add(15, 15.2);
		add(20.8, 96);
		add(10, 'F', true);
		
		
	}

}
