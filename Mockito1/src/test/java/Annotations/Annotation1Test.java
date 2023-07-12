package Annotations;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class Annotation1Test {
    static int beforeClassCount=1 ,afterClassCount=1,beforeCount=1, afterCount=1;

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
    public void Tes1()
    {
        assertEquals("Hello",Annotation1.display());
        System.out.println("test1 exceuted");
    }
    @Test
    public void Test2()
    {

        assertEquals("Sahithi",Annotation1.display1());
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