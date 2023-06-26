//program stores set of string string objects in arraylist and printing them in random order and removing spaces using trim method
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args)
    {
        List<String> obj=new ArrayList<String>();
        //adding elements into arraylist
        obj.add(" Hello ");
        obj.add("hii");
        obj.add("welcome");
        obj.add("Hitachi");
        obj.add("vanatara ");
        obj.add("Hello");
        obj.add("hyderabad ");
        System.out.println("original list before shuffling");
        //printing elements using iterator
        Iterator<String> itr=obj.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() );
        }
        System.out.println(obj);
        System.out.println("**************");
        System.out.println("list after removing trailing and leading  spaces");
        List<String> li=new ArrayList<String>();
        for(String s:obj)
        {
           li.add(s.trim());
        }
        obj=li;
        System.out.println(obj);
        System.out.println("*******");
        //shuffling elements to print arraylist elements in random order
        Collections.shuffle(obj);
        System.out.println("printing strings in random order after shuffling");
        Iterator<String> itr1=obj.iterator();
        while(itr1.hasNext())
        {
            System.out.println(itr1.next() );
        }





    }
}
