package SelektionOpgaver.Opg6;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
    public void testCalc(){
        Calc calc1 = new Calc();
        assertEquals(2,calc1.findMid(1,2,3));
        Calc calc2 = new Calc();
        assertEquals(6,calc2.findMid(6,3,9));
        Calc calc3 = new Calc();
        assertEquals(2,calc3.findMid(2,3,2));
    }
}
