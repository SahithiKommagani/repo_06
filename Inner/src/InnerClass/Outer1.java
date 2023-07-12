//program demostranting use of inner class with instance method and accessing inner class code from static content
package InnerClass;
//creating outer class
 class Outer1 {
     int a=10;
     static int b=20;
    class Inner1{
        int a=30;
        public void display()
        {
           int a=80;
           // static int a=90;//throw error
            System.out.println( "local value of a defined inside method " +a);// a will print bcz method is instance method
            //here by default a =80 will print

            System.out.println(b);//b will print we can't declare static but we can access
            System.out.println("Hello inner");
            System.out.println("value of a defined inside class " +this.a);//if we want to print a=30 defined inside class
            System.out.println("value of a defined in outer class " +Outer1.this.a);//if we want to print outer class defined value
        }

    }
    public void print()
    {
        System.out.println("Hello Outer");
    }
    public static void main(String[] args)
    {
        //creating object of outer class
        Outer1 o=new Outer1();
        //calling outer class method
        o.print();
        //creating object of inner class with reference of outer class
        Outer1.Inner1 i=o.new Inner1();
        //new Outer1().new Inner1().display();/in single line
        //calling inner class method
        i.display();

    }
}
