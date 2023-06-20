package com.training;

public class StringConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//finding no of strings passed throudh command line arguments
		System.out.println("No of  Strings Passed through command line "+args.length);
		//String sb=args[0] + " "+args[1]+ " "+args[2];
		//concatenation using stringBuffer
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<args.length;i++)
		{
			sb.append(args[i] + " ");
		}
		String str=new String(sb);
		//printing Concatenated String
		System.out.println(sb);
		//retrieving last entered string 
		String word=args[args.length-1];
		String temp[] =str.split(" ");
		int count=0;
		for(int i=0;i<temp.length;i++)
		{
			
			if(word.equals(temp[i]))
			{
				count++;
			}
		}
		System.out.println("No of occurences of last command line input  " +count);
		
		
        
	}

}
