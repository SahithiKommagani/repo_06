public class StringBuilderExample {
    public static void main(String[] args)
    {
        StringBuilder sbf=new StringBuilder();//creates empty string with initial capacity
        System.out.println(sbf.capacity());//prints initial capacity
        StringBuilder sb=new StringBuilder(10);//creates empty stringbuilder with specified capacity
        System.out.println(sb.capacity());
        StringBuilder sbf1=new StringBuilder("Hello");//creates string builder with specified string
        //appending one string with another
        System.out.println(sbf1.append("world"));
        //inserting at specified position
        System.out.println(sbf1.insert(4,"hi"));
        //unicode character at index 4
        //System.out.println(sbf1.appendCodePoint(4));
        //replacing with specified index
        System.out.println(sbf1.replace(2,4,"wo"));
        //delete at specified index
        System.out.println(sbf1.delete(2,4));
        //converting to string
        System.out.println(sbf1.toString());
        System.out.println(sbf1.chars());
        System.out.println(sbf1.codePointCount(1,3));
        sbf1.trimToSize();
        System.out.println(sbf1);
        //reversing
        System.out.println(sbf1.reverse());
        //finding length
        System.out.println(sbf1.length());
        //unicode character at index 4
        System.out.println(sbf1.appendCodePoint(4));

    }
}
