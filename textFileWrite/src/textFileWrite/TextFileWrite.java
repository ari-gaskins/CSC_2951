package textFileWrite;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class TextFileWrite {
	public static void main (String [] args) throws IOException{
		FileInputStream fileByteStream = null;
		FileOutputStream fileStream = null;
		Scanner inFS = null;
		PrintWriter outFS = null;
		
		 // Try to open file
		 System.out.println("Opening myoutfile.txt...");
	     fileStream = new FileOutputStream("myoutfile.txt");
	     outFS = new PrintWriter(fileStream);

	     // Arriving here implies that the file can now be written
	     // to, otherwise an exception would have been thrown.
	     System.out.println("Writing to myoutfile.txt...");
	     outFS.println("Hello");
	     outFS.println("1 2 3");

	     // Done with file, so try to close
	     // Note that close() may throw an IOException on failure
	     System.out.println("Closing myoutfile.txt...");
	     outFS.close();
	     
	     System.out.println("Opening myoutfile.txt...");
	     fileByteStream = new FileInputStream("myoutfile.txt");
	     inFS = new Scanner(fileByteStream);
	     
	     System.out.println("Reading myoutfile.txt...");
	     
	     while (inFS.hasNext()) {
	    	 System.out.println(inFS.next());
	     }
	     
	     System.out.println("Closing myoutfile.txt...");
	     fileByteStream.close();
	     inFS.close();
	}
}
