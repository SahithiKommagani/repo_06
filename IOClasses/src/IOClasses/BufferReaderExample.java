//program to demonstrate usage of Bufferedeader
package IOClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//filreader reads line character by character
		FileReader fr=new FileReader("Hello1.txt");
		//buffered reader reads the file line by line
		long starttime=System.currentTimeMillis();
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		long finalTime=System.currentTimeMillis();
		long timeTaken=finalTime-starttime;
		System.out.println("Time taken to read file using Buffered Reader = " +timeTaken);//timetaken is less compare to file reader
		
		fr.close(); 
		br.close();

	}

}
