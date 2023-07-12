//program demostranting use of inner class with static method and accessing inner class code form instance area of outer class

package InnerClass;

public class Outer2 {
    int a=10;
     static int b=20;
    class Inner2
    {
        static void display()
        {
           // System.out.println(a); //throw error because we cant access non static fields inside static
            System.out.println(b);
        }
    }
    public void display1()
    {
        Inner2 i=new Inner2();
        i.display();
    }
    public static void main(String [] args)
    {
        Outer2 o=new Outer2();
        o.display1();
    }
}
