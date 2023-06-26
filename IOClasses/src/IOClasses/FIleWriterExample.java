//program to demonstarate fileWriter
package IOClasses;

import java.io.FileWriter;
import java.io.IOException;

public class FIleWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("File Writer Example*****");
		//writes data into file if file doesnot exist it will create new file
		FileWriter fw=new FileWriter("Hello.txt");//overrides file
		FileWriter fw1=new FileWriter("Hello2.txt",true);//appends end of file
		fw.write("Welcome to IO Example");
		fw.write("File Writer Example");
		fw1.write("Welcome to IO Example");
		fw1.write("File Writer Example");
		fw.close();
		fw1.close();

	}

}
