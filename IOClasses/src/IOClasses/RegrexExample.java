package IOClasses;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegrexExample {
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String s1");
		String s1=sc.nextLine();
		String Regrex1="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern c=Pattern.compile(Regrex1);
		Matcher m=c.matcher(s1);
		if(m.find())
		{
			System.out.println( "Match found ");
		}
		else
		{
			System.out.println("match not found");
		}
		
		System.out.println(Pattern.matches(".a.", "sah")); //returns true
		System.out.println(Pattern.matches("[a-zA-Z][a-zA-Z][a-zA-Z]", "aZA")); 
		// This statement returns True because the all the characters in string matches with the  with the regular expression. 
		System.out.println(Pattern.matches(".*thi.*", "sahithi"));
		System.out.println(Pattern.matches("\\h*", "hitachi"));
		
	}

}
