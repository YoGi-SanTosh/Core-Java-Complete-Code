package StringConcept14Feb2025;

import java.util.Scanner;

public class ArrayInputatRunTime19feb25 {

	public static void main(String[] args) {

		Scanner sc1 =new Scanner(System.in);
		System.out.println("Please Enter the size of your Array");
		int age[]=new int[sc1.nextInt()];
		for(int i=0;i<age.length;i++)
		{
			System.out.println("please enter the value at index " + i);
			age[i]=sc1.nextInt();
		}
		
	}

}
