package IOClasses;

import java.io.File;
import java.io.IOException;

public class FileExample {

	public static void main(String[] args)
	{
		//creating new file 
		System.out.println("****** Creating a File ******");
		File f=new File("Hello1.txt");
		try {
			//checking if new file is created
			if(f.createNewFile())
			{
				System.out.println("New file created");
			}
			else
			{
				System.out.println("Already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//returns file name
		System.out.println(f.getName());
		//returns absolute path of the file
		System.out.println(f.getAbsolutePath());
		System.out.println(f.canExecute());
		//returns null beacause it doesnot contain any parent directory
		System.out.println(f.getParent());
		System.out.println(f.toURI());
		File f1=new File("C:\\eclipse-workspace");
		System.out.println();
		System.out.println(" *****Listing Files ****");
		//retrieving list of files and directories from the given path
		String[] f2=f1.list();  
	    for(String f3:f2){  
	        System.out.println(f3);  
	        
	    } 
	    
	}

}
