package PrivateMethods;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class SamplePrivateTest {
      SamplePrivate p=new SamplePrivate();
      @Test
      public void test() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
          Method m=SamplePrivate.class.getDeclaredMethod("display", String.class, String.class);
          m.setAccessible(true);
          String concat= (String) m.invoke(p,"Hello","World");
          assertEquals("HelloWorld",concat);

      }


}