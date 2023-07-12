package StaticInner;

public class Outer1 {
    String s="Sahithi";
    static String s1="Sahithi";
    static  class Inner
    {
        public void display()
        {
            System.out.println("hello world");
            //System.out.println(s);//throw error
            System.out.println(s1);//prints sahithi

        }
      static void display1()
        {
           // System.out.println(s);//error because call is static
            System.out.println(s1);
        }
    }
    public void show()
    {
        System.out.println("Hello Outer");
    }
    public static void main(String[] args)
    {

        Outer1 o=new Outer1();//creating outer class
        o.show();
        Outer1.Inner i= new Inner();
        i.display();
        Outer1.Inner.display1();//no need to create instance of static method

    }
}
