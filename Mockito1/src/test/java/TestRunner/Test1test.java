package TestRunner;



import PrivateMethods.SamplePrivate;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test1test {
    Test1 t=new Test1();
    @Test
    public void add()
    {
        assertEquals(15,t.add());
    }
    @Test
    public void subtract()
    {
        assertEquals(5,t.subtract());
    }
    @Test
    public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method m=Test1.class.getDeclaredMethod("display", String.class, String.class);
        m.setAccessible(true);
        String concat= (String) m.invoke(t,"Hello","World");
        assertEquals("HelloWorld",concat);

    }
}
