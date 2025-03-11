package ExceptionHandlinginJava11Feb25;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

		public class ThrowsKeywordHowimportdatafromExcelfile {
    	    // Method that declares it can throw an IOException

		        // Path to the Excel file

	  public static void readFile() throws IOException {
		    	     FileReader file = new FileReader("nonexistentfile.txt");
		    	     BufferedReader fileInput = new BufferedReader(file);
		  throw new IOException("File not found");
		}

 // Another method that calls readFile and must handle the exception or declare it
	  public static void handleFile() throws IOException {
		  readFile();  // Calling method that throws IOException
		    	    }

	  public static void main(String[] args) {
		  try {
			  	handleFile();  // Exception handled here
		  	} 
		  catch (IOException e) 
		  {
		    System.out.println("Exception caught: " + e.getMessage());
		    	            
		  } 
}
}