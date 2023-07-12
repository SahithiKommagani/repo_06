import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Assertions {
    String s="str";
    String s1="str";
    String s2=new String("xyz");
    String s3=new String("xyz");
    String s4=null;
    int a = 10;
    int b = 6;
    String[] expectedArray = {"one", "three","two"};
    String[] resultArray =  {"one", "two", "three"};
    @Test
    public void test1() {
        assertEquals(s, s1);
    }
    @Test
    public void test2() {
        assertEquals(s2, s3);

    }
    @Test
    public void test3() {
          assertSame(s2,s3);
    }
    @Test
    public void test4() {
        assertNotSame(s2, s3);
    }
    @Test
    public void test5() {
        assertTrue(a > b);
    }
    @Test
    public void test6() {
        assertFalse(a < b);
    }
    @Test
    public void test7() {
        assertArrayEquals(expectedArray, resultArray);
    }
    @Test
    public void test8() {
        assertNotEquals(s, s3);
    }
    @Test
    public void test9() {
        assertNotNull(s3);
    }
    @Test
    public void test10()
    {
        assertNull(s4);
    }
}
