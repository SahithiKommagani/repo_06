package InnerClass;

public class NestedInner {
    class A{
        class B
        {
            public void show1()
            {
                System.out.println("Innermost class");
            }
        }
        public void show()
        {
            System.out.println("Inner class");
        }
    }
    public void show2()
    {
        System.out.println("Outer class");
    }
    public static void main(String [] args)
    {
        NestedInner n=new NestedInner();//creating outer class object
        NestedInner.A a=n.new A();//creating inner class object
        NestedInner.A.B b=a.new B();//creating object for class inside inner class
        a.show();
        b.show1();
        n.show2();

    }

}
