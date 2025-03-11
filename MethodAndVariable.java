package MethodAndOperatorOrVariable17Jan2025;

public class MethodAndVariable {
	
	
//static method inside a class
	
	static void add()
	{
		int a=50;
		int b=60;
		int sum = a+b;
		System.out.println(sum);
		}
//subtraction two number in static method 	
	static void sub()
	{
		int a=10;
		int b=20;
		int sub = a-b;
		System.out.println(sub);
		
	}

//multiple two number
	static void mul()
	{
		int a=10;
		int b=20;
		int mul = a*b;
		System.out.println(mul);
		
	}

	//multiple two number
		static void div()
		{
			int a=10;
			int b=20;
			int  div= a/b;
			System.out.println(div);
			
		}

//multiple two number
		static void mod()
		{
			int a=10;
			int b=20;
			int mod = a%b;
			System.out.println(mod);
			
		}

	public static void main(String[] args) {
	
//how to call static method inside a main method
		add();  //call by name
		sub();
		mul();
		div();
		mod();
		

	}

}
