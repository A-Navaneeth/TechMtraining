package test;


import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator cal=new Calculator();
        int res=cal.add(4,4);
        assertEquals(8,res);
      


    }

}
