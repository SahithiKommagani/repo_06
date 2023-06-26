//program to demonstrate BufferedWriter
package IOClasses;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffereWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     FileWriter fw=new FileWriter("Hello.txt",true);
     //writes data to internal buffer first and later to file when buffer is full
     BufferedWriter bfw=new BufferedWriter(fw);
     bfw.append('k');
     bfw.write("Hello Welcome to my world \n");
     bfw.write("Hello World \n"); 
     bfw.flush();//force the data written immediately to file 
     bfw.close();
     System.out.println("Example  BufferedWriter");	
	}

}
