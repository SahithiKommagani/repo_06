//program to demonstrate usage of filereader
package IOClasses;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long starttime = System.currentTimeMillis();
		//filereader reads file character by character
		FileReader fr = new FileReader("Hello1.txt");
		int i;
		// iterating untill end of file
		while ((i = fr.read()) != -1)
			// read() return ascii value of character so were doing casting
			System.out.print((char) i);
		long finalTime = System.currentTimeMillis();
		long timeTaken = finalTime - starttime;
		System.out.println("Time taken to read file using File Reader = " + timeTaken);
		// closing file
		fr.close();
		
		
		
		

	}

}
