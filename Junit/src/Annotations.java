import org.junit.Ignore;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class Annotations {
    String message ="Hello Team";
    static int beforeClassCount=1 ,afterClassCount=1,beforeCount=1, afterCount=1;
    int a=8,b=10,c;
    @BeforeAll
  static void print1()
    {
        System.out.println("It prints before all test methods " +beforeClassCount++);
    }
    @BeforeEach
    public void Print()
    {
        System.out.println(" It print Before each test method "+beforeCount++);
    }
    @Test
    public void add()
    {
        c=a+b;
        assertEquals(18,c);
        System.out.println("test1 exceuted");
    }
    @Test
    public void multiply()
    {
        c=a*b;
        assertEquals(80,c);
        System.out.println("Test 2 executed");
    }
    @Ignore
    public void show()
    {
        System.out.println("Hello");
    }


    @AfterEach
    public void print2()
    {
        System.out.println("It prints after each test method "+afterCount++);
    }
    @AfterAll
   static void print3()
    {
        System.out.println("prints after all test methods" +afterClassCount++);
    }

}
