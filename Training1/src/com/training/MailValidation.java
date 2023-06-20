package com.training;

import java.util.regex.Pattern;

public class MailValidation {
	public static boolean isValid(String email)
	{
		//validation using regrex 
		String Regrex="^[a-zA-Z0-9_+&*-]+(?:\\."+
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";
		Pattern c=Pattern.compile(Regrex);
		//if (email == null)
           // return false;
        return c.matcher(email).matches();
	}
	public static void main(String[] args)
	{
		//input using command line arguments
		String email=args[0];
		System.out.println(args[0]);
		 if (isValid(email))
             System.out.println("entered email Address is valid");
         else
             System.out.println("entered email Address is invalid");
		
	}

}
