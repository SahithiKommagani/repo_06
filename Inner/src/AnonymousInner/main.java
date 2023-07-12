//program implemnting interface using anonymous classes
package AnonymousInner;

public class main {
    public static void main(String[] args)
    {
        Runnable r=new Runnable() { //runnable is interface
            @Override
            public void run() {
                for(int i=1;i<10;i++)
                {
                    System.out.println(i +"child Thread");
                }
            }
        };
        Thread t=new Thread(r);
        t.start();
        for(int i=1;i<10;i++)
        {
            System.out.println(i +"parent thread");
        }
    }
}
