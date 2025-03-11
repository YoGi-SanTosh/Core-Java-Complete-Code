package MethodAndOperatorOrVariable17Jan2025;

public class SataicParameterizedHowToCallThem {
	
	static void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void sub(int a,double b,char c,String name, boolean answer)
	{
		System.out.println("pass the all details then it will execute");
	}
	
	static void mul (int a,double b)
	{
		System.out.println(a*b);
	}
	
	static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	
	static void student(String name)
	{
		System.out.println("Santosh");
	}
	

	public static void main(String[] args) {

		add(15,10);
		sub(10, 2.30, 'A', "Santosh", false);
		mul(12, 5.6);
		div(150, 50);
		student("Kumar");
		
		
		
		
		
		
		
		
		
	}

}
