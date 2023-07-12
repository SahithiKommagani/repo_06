package Mockito;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @InjectMocks
    Calculator c =new Calculator();
    @Mock
    CalculatorService cs;
    @Test
    public void testAdd(){
        //add the behavior of calculator service to add two numbers
        when(cs.add(10,20)).thenReturn(30);

        //test the add functionality
       assertEquals(c.add(10,20),30,0);
    }
    @Test
    public void testSub()
    {
       when(cs.sub(20,10)).thenReturn(10);
       assertEquals(10,c.sub(20,10));


    }
    @Test
    public void testMul()
    {
        when(cs.sub(20,10)).thenReturn(200);
        assertEquals(200,c.sub(20,10));

    }
    @Test
    public void testDiv()
    {
        when(cs.sub(20,10)).thenReturn(2);
        assertEquals(2,c.sub(20,10));


    }



}