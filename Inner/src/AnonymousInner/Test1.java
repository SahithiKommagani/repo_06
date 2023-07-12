package AnonymousInner;

public class Test1 {
    public static void main(String [] args)
    {
        Thread t=new Thread()
        {
            public void run()
            {
                for(int i=1;i<10;i++)
                {
                    System.out.println(i + "child thread");
                }
            }
        };
        t.start();
        for(int i=1;i<5;i++)

        {
            System.out.println(i +"parent thread");
        }
    }
}
