package InheritanceConceptInJava30Jan25;

public class ThisKeywordGlobalAndLocalProgram {

	String name;
	double salary;
	int age;
	
	void studentdetails(String name,double salary,int age)
	{
		this.name=name;
		this.salary=salary;
		System.out.println("My Name is->" + name);
		System.out.println("My Salary is->" + salary);
		System.out.println("My Age is->" + age);

	}
	
	public static void main(String[] args) {

		ThisKeywordGlobalAndLocalProgram s1=new ThisKeywordGlobalAndLocalProgram();
		s1.studentdetails("Santosh", 150000, 35);
		
	//	System.out.println(s1.name);
	//	System.out.println(s1.salary);
	//	System.out.println(s1.age);

		
	}

}
