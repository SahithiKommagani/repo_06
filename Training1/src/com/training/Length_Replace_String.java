package com.training;

public class Length_Replace_String {
    public static void main(String[] args)
    {
   //input using command line arguments
    String input=args[0];
    //displaying entered string
    System.out.println("entered String = " + input);
    //length of string
    System.out.println("Length of String =" +input.length());
    //changing string to array
    char[] ch=input.toCharArray();
    //displaying array elements
    for(char c:ch)
    {
    System.out.println(c);
    }
    //replacing with #
    for(int i=1;i<ch.length-1;i++)
    {
    	ch[1]='#';
    	if(i%2==1)
    	{
    		ch[i]='#';
    	}
    	
    }
    
    System.out.println(" entered String " +input);
    String s=new String(ch);
    System.out.println("replaced String " +s);
    	
}
}
