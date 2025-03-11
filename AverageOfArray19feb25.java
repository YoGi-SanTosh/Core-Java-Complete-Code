package StringConcept14Feb2025;

public class AverageOfArray19feb25 {

	public static void main(String[] args) {

		double[] rollno1=new double[4];
		rollno1[0]=10;
		rollno1[1]=20;
		rollno1[2]=30;
		rollno1[3]=40;
		double sum=0;
		double Average=0;
		for(int i=0;i<=3;i++)
		{
			sum= sum+ rollno1[i];
		}
		
		System.out.println("sum is :" + sum);
		Average=sum/rollno1.length;
		System.out.println("Average is :" + Average);
	}

}
