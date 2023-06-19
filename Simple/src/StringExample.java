import javax.sound.midi.SysexMessage;

public class StringExample {
    public static void main(String args[])
    {
        //ways of creating String
        //string literal
        String str="Hello"; //(both str and str1 are equal because points to same memory location)
        String str1="Hello";
        //new Keyword
        String str2=new String("Hello");//(str2 and str3 are not equal because they points to different memory location)
        String str3=new String("Hello");

        if(str==str1)
        {
            System.out.println("Strings created using string literal are equal");
        }
        else
        {
            System.out.println("not equal"); //prints not equal
        }
        if(str2==str3)
        {
            System.out.println("equal");
        }
        else
        {
            System.out.println("Strings created using new keyword are not equal"); //prints not equal
        }
        //to store store String that is created using new in string constant pool
        String pool=new String("Sahithi");
        String pool1=pool.intern();
        String s33="Sahithi";
        if(pool==pool1)
        {
            System.out.println("both are equal");
        }
        else {
            System.out.println("Not equal");
        }

        str.concat("World");
        System.out.println(str);//prints hello itself because String is immutable its value willnot change
        String merge=str.concat("World");
        System.out.println(str);
        System.out.println(merge);//creates new string HelloString
        System.out.println();
        System.out.println("Basic String Methods");
        System.out.println("***************");
        String s1="Hitachi Vantara";
        String s2="pentaho Data Integration";
        String s3="Hitachi";
        String s4="";
        System.out.println("Printing length of string using length() method =" +s1.length());
        System.out.println("Printing Character at specified index  using charAt(index) = " +s1.charAt(5));
        System.out.println("Printing sub string from specified character to end  using subString(index)= " +s1.substring(3) );
        System.out.println("printing substring with in specified index using substring(start,end) = "+s1.substring(2,8));
        System.out.println("concatenating two string = using concat(str) "+s1.concat(s2));
        System.out.println("Returns index of first occurance of string = "+s2.indexOf("Data"));
        System.out.println("Returns index of first occurance of character = "+s2.indexOf("a"));
        System.out.println("Returns index of last occurance of character = "+s2.lastIndexOf("a"));
        System.out.println("checking equality using equals = "+ s1.equals("hitachi vantara"));
        System.out.println("checking equality  using equalsIgnoreCase= "+ s1.equalsIgnoreCase("hitachi vantara"));
        System.out.println("comparing using compareTo =" +s1.compareTo(s3));//compares lexographically
        System.out.println("converts all characters to lower case = "+s1.toLowerCase());
        System.out.println("converts all characters to upper case = "+s1.toUpperCase());
        System.out.println("removing whitespaces using trim = "+s1.trim());//doesnot effect middle spaces
        System.out.println("replacing characters = "+s1.replace("a","@"));
        System.out.println("checking if string is empty or not ="+s4.isEmpty());
        System.out.println("returning unicode character of specified index =" +s1.codePointAt(3));
        System.out.println("returning unicode character of  just before specified index =" +s1.codePointBefore(3));//returns unicode character of 2 index character
        System.out.println(s1.codePointCount(4,8));//returns the count of Unicode code points between the range.
        System.out.println(" checking whether string contains specified string = " +s1.contains("Vantara"));
        System.out.println(s1.hashCode());
        System.out.println(s2.startsWith("pentaho"));
        System.out.println(s2.endsWith("Pentaho"));
        char[] ch=s1.toCharArray();//converting String to Array
        for(char c:ch)
        {
            System.out.println(c);
        }
        String regrex=".*Data.*";
        String regrex1=".*Data";
        System.out.println(s2.matches(regrex));
        System.out.println(s1.matches(regrex));





    }
}
