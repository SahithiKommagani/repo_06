package IOClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		User u=new User("Sahithi","Hyderabad","$ahi123");
		//u.toString();
		//Serialization
		try {
			FileOutputStream fo=new FileOutputStream("user.txt");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(u);
			os.close();
			fo.close();
			System.out.println("Serilaization successfull");	
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//Deserialization
		try {
		FileInputStream fin=new FileInputStream("user.txt");
		ObjectInputStream oi=new ObjectInputStream(fin);
		u=(User)oi.readObject();
		oi.close();
		fin.close();
		}
		catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		//printing 
		System.out.println("Deserialized user object");
		System.out.println("Name = " +u.getName());
		System.out.println("Address = " +u.getAddress());
		System.out.println("Password = " +u.getPassword());//password value will be null because declared variable as transient 
		
		
	}

}
