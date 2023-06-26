//program to demonstate printWriter

package IOClasses;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;

public class PrintWriterExample {

	public static void main(String[] args) throws FileNotFoundException {
		  // write  data on Console using PrintWriter  
		PrintWriter pw=new PrintWriter(System.out);
		String s="Sahithi";
		pw.println(false);//can print boolean ,array,obj,double etc
		pw.println('k');
		pw.println(3);
		pw.println(pw);
		pw.println(pw.checkError());
		pw.println(pw.format(Locale.ITALY,"helo %s ", s));
		int[] a= {1,4,5,7};
		for(int i:a)
		{
		pw.println(i);
		}
		pw.println(1.9);
		pw.close();
		//write data to file
		PrintWriter pw1=new PrintWriter("Hello2.txt");
		pw1.write("welcome to programming");
		pw1.close();

	}

}
