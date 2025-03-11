package ExceptionHandlinginJava11Feb25;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

public class ThrowskeywordsConcept {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, FileNotFoundException {

		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
			Thread.sleep(2000);
			URL ul=new URL("https://www.google.com/");
			
			FileInputStream f1 =new FileInputStream("file");
			
		}
	}

}
