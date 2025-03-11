package VariableLocalGlobalFinalinillizationAndDeclaration;

public class LocalVariableInillizationAndDeclearation {

//non static method 
	void add()
	{
		int a=100;//local variable declaration and initialization
		System.out.println("using in same method" + a);
	}
	
//static method
	static void sub()
	{
		int b=90;//local variable declaration and initialization
		System.out.println(b);
	}
	
	
	public static void main(String[] args) {

		LocalVariableInillizationAndDeclearation a1=new LocalVariableInillizationAndDeclearation();
		a1.add();
		sub();
		
	//	System.out.println(a);
		
	}

}

//we can't use this local variable out side of the method where we have to declaration and initialization'