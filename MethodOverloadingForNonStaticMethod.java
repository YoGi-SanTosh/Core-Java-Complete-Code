package MethodConstructorOverloadingConcept23Jan2025;

public class MethodOverloadingForNonStaticMethod {

	void add(int a, double b,int c) 
	{
		System.out.println("First Nonstatic method");
	}
	
	void add(double c,boolean abc) 
	{
		System.out.println("Overload First Nonstatic method");
	}

	
	public static void main(String[] args) {
		
		MethodOverloadingForNonStaticMethod nonmtd=new MethodOverloadingForNonStaticMethod();
		nonmtd.add(112, 10.02, 13);
		nonmtd.add(23.03, false);
		

	}

}
