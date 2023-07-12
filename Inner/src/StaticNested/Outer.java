package StaticNested;

import StaticInner.Outer1;

public class Outer {
     static String  s="Hi";
    static class Inner
    {
        static  class Nested
        {
            public static void m()
            {
                System.out.println(s);
                System.out.println("Nested class method");
            }
        }
        public void m1()
        {
            System.out.println(s);
            System.out.println("Inner class method called");
        }
    }
    public void m2()
    {
        System.out.println("Outer class method called");
    }
    public static void main(String [] args)
    {
        Outer o=new Outer();
        o.m2();
        Outer.Inner i=new Inner();
        i.m1();
        Outer.Inner.Nested.m();

    }
}
