package TestRunner;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test2test {
    Test2 t1=new Test2();
    @Test
    public void Test3()
    {
        assertEquals(72,t1.multiply());
    }
    Test1 t=new Test1();
    @Test
    public void add()
    {
        assertEquals(11,t.add());
    }
    @Test
    public void subtract()
    {
        assertEquals(5,t.subtract());
    }

}
