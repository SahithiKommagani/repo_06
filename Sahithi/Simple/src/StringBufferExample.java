public class StringBufferExample {
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer();//mutable//empty string
        StringBuffer sb1=new StringBuffer("Welcome"); //creates a string buffer with the specified string.
        System.out.println(sb1);
        System.out.println("initial capacity =" +sb.capacity());//initial capacity
        sb.append("Hello Sahithi");//to append
        sb.append(" ");
        System.out.println(sb);
        System.out.println("inserting at specified index =" +sb.insert(5," hi"));
        //ensures that the given capacity is the minimum to the current capacity.
        sb.ensureCapacity(10);
        System.out.println(sb.capacity());
        //replacing String using replace() method
        System.out.println(sb.replace(2,8,"pencil"));
        //deleteing string within specified index
        System.out.println(sb.delete(2,8));
        //initial capacity 16  If the number of characters increases from its current capacity,
        //it increases the capacity by (oldcapacity*2)+2.
        System.out.println(sb.capacity());
        //finding length of string
        System.out.println(sb.length());
        //reversing string
        System.out.println(sb.reverse());
        //finding char at index 4
        System.out.println(sb.charAt(4));
        //deleting char at index 4
        System.out.println(sb.deleteCharAt(4));
        System.out.println();
        //prints unicode character at index 5
        System.out.println(sb.codePointAt(5));
        //comparing two strings
        System.out.println(sb.compareTo(sb1));
        //finding last index of specified Strings
        System.out.println(sb.lastIndexOf("H"));
        //finding substring
        System.out.println(sb.substring(3,7));
        //checking whether buffer empty or not
        System.out.println(sb.isEmpty());
        System.out.println(sb.equals("hello"));
        System.out.println(sb.hashCode());





    }
}
