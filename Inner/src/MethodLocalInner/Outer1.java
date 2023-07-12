//program demonstrates method local inner class
package MethodLocalInner;

public class Outer1 {
    static int a=70;
    int b=30;
    public void display()
    {
        class Inner //class inside method
        {
            int sum=0;
            int c=90;
            public void calculate(int n)
            {
                int c=80;
               for(int i=1;i<n;i++)
               {
                   sum=sum+i;
               }
               System.out.println("sum of " +n + "numbers " +sum);
               System.out.println(a);
               System.out.println(this.c);//print 80
            }
            static void show()
            {
                System.out.println(a);
               // System.out.println(b);//static method so it can't access non static
            }
        }
        Inner i=new Inner();//creating object of inner class inside method bcz outside method we can't access
        i.calculate(10);
        i.calculate(20);
        i.calculate(30);
        Inner.show();
    }
    public static void main(String[] args)
    {
        Outer1 o=new Outer1();
        o.display();
    }
}