//program to demonstrate file operations
package IOClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		{
			// creating new file
			System.out.println("****** Creating a File ******"); // creating file operation
			File f = new File("Hello3.txt");
			try {
				// checking if new file is created
				if (f.createNewFile()) {
					System.out.println("New file created");
				
				} else {
					System.out.println("Already exists");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		

			System.out.println(" ***** Writing to a file *****");// writing file operation

			try {
				FileWriter fw = new FileWriter("Hello3.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				pw.write("Hello programmer");
				fw.close();
				pw.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			

			System.out.println(" *****Reading from  a file *****");// Reading file operation
			try {
				FileReader fr = new FileReader("Hello3.txt");
				BufferedReader br = new BufferedReader(fr);
				String line;
				while ((line = br.readLine()) != null) {
					System.out.println(line);
				}
				fr.close();
				br.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			System.out.println();
            
			System.out.println("****Listing Files and directories from given path ****");//listing operation
			File f1 = new File("C:\\eclipse-workspace");
			System.out.println();
			// retrieving list of files and directories from the given path
			String[] f2 = f1.list();
			for (String f3 : f2) {
				System.out.println(f3);

			}
			// storing list of files in an file array
			File[] f4 = f1.listFiles();
			for (File f5 : f4) {
				System.out.println(" retrieving name =" + f5.getName() + "checking can read =" + f5.canRead()
						+ "Checking can write = " + f5.canWrite() + "checking can execute = " + f5.canExecute()
						+ "file length = " + f5.length() + " chceking any hidden = " + f5.isHidden());
			}
			
			
			System.out.println();
			System.out.println("***** creating directory ****"); //creating directory
			
			File fd=new File("Directory");
			if(fd.mkdir())
			{
				System.out.println("Directory Created " + fd.getName());
				
			}
			else
			{
				System.out.println("Already exists");
			}
			
			System.out.println(); 
			System.out.println(" *****Renaming Directory  ******"); //renaming directory
			File old =new File("Directory");
			File new1=new File("Directory1");
			if(old.renameTo(new1))
			{
				System.out.println("Directory renamed successfully " +new1.getName());
			}
			else
			{
				System.out.println("Failed to rename directory ");
			}
			
			
			System.out.println();
			System.out.println("**** Deleting a File ****"); //deleting file
			File delete=new File("Hello2.txt");
			if(delete.delete())
			{
				System.out.println("File deleted " +delete.getName());
			}
			else
			{
				System.out.println("File doesnot exist");
			}
			

		}

	}

}
