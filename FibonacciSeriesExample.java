package StringConcept14Feb2025;
import java.util.Scanner;
public class FibonacciSeriesExample {

	public static void main(String[] args) {
		int fiblength;
//use scanner class to get the user input
		Scanner sc =new Scanner(System.in);
		System.out.println("Plese Enter the Number");
		fiblength=sc.nextInt();
		int[] num = new int [fiblength];
//Assign value 0 and 1 to the o and 1 indices of the defined array using for loop
		num[0]=0;
		num[1]=1;
		
		for(int i=2;i<fiblength;i++)
		{
			num[i]=num[i-1]+ num[i-2];
		}
		System.out.println("fibonacci series:");
//printing the fibonacci series
		for(int i=0;i<fiblength;i++)
		{
			System.out.println(num[i]+"");
			sc.close();
		}
	}
}
