package TypeCastingAndPolymorphism07March2025;

public class ConvertIntIntoDoubleWithImplicitAndExplicitly {

	public static void main(String[] args) {

		//problem:1 lets convert int into double
		double d1=  100;
		System.out.println(d1);//Implicit Syntax
		
		double d2 =(double) 500;
		System.out.println(d2);//Explicitly Syntax
		
		int a=19;
		double d3 = a;
		System.out.println(d3);
	}

}
