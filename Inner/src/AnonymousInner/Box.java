//program implementing interface using anonymous class
package AnonymousInner;

public interface Box {
    public void volume();
}
class MainDemo
{
    public static void main(String [] args)
    {
        Box b=new Box(){
            int length=10;
            int breadth=20;

            @Override
            public void volume() {
                System.out.println("volume = " +length*breadth);
            }
        };
        b.volume();
    }
}
