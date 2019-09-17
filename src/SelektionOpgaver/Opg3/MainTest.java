package SelektionOpgaver.Opg3;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    Calculator calc = new Calculator();
    public void testCalc(){
        assertEquals(6,calc.findGreatest(2,6));
        assertEquals(4,calc.findGreatest(4,2));
        assertEquals(3,calc.findGreatest(3,3));
    }
}
