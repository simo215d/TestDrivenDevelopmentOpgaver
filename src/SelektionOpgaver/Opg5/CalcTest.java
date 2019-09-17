package SelektionOpgaver.Opg5;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
    public void testCalc(){
        Calc calc1 = new Calc();
        assertEquals("62 tilhøre [60:69]",calc1.findX(62));
        Calc calc2 = new Calc();
        assertEquals("1 tilhøre [0:9]",calc2.findX(1));
    }
}