//program that demonstartes advantages of generics
package Generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args)
    {
        //non generic no type declaration
        List l=new ArrayList();
        l.add("hello");
        l.add(7);
        l.add(8.07);
        int s= (Integer) l.get(1);//typecasting required for non generic objects
        System.out.println(s);
        System.out.println(l);
        //using generics we specify type
        List<String> al=new ArrayList<String>();
        al.add("hello");
        al.add("bye");
       // al.add(7);//throws compileTime error //type safe 
        String s1=al.get(0);//no typecasting required for generic types
        System.out.println(s1);
        System.out.println(al);

    }
}
