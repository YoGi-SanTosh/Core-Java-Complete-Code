package MethodConstructorOverloadingConcept23Jan2025;

public class ConstructorOverloading24Jan2025 {

	ConstructorOverloading24Jan2025()
	{
		System.out.println("this is my 1st constructor");
	}
	
	ConstructorOverloading24Jan2025(int a)
	{
		System.out.println("this is my 2nd costructor verloading by 1t constructor");
	}
	
	ConstructorOverloading24Jan2025(int a ,double b)
	{
		
		System.out.println("this is my 3rd constructor overloadingby 2nd constructor");
	}
	
	
	
	public static void main(String[] args) {
		
		new ConstructorOverloading24Jan2025();
		new ConstructorOverloading24Jan2025(55);
		new ConstructorOverloading24Jan2025(10,10.2);
		

	}

}
