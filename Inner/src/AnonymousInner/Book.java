//anonymous inner class extending class
package AnonymousInner;

public class Book {//Book.class file
    void buy()
    {
        System.out.println("Java Book");
    }
}
class Test //Test.class
{
    public static void main(String [] args)
    {
        //anonymous class is created
        //for one type requirement
        Book b=new Book(){ //Book$1.class
            public void buy()
            {
                System.out.println("Unix Book");
            }
        };
        Book b2=new Book() //Book$2.class
        {
            public void buy()
            {
                System.out.println("Collections Book");
            }
        };
        b.buy(); //calling anonymous inner class method
        Book b1=new Book();
        b1.buy();//calling book method
        b2.buy();
        System.out.println(b.getClass().getName());
        System.out.println(b1.getClass().getName());
        System.out.println(b2.getClass().getName());

    }
}
