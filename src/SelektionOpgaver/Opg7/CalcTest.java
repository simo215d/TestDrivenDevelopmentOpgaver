package SelektionOpgaver.Opg7;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
    public void testCalc(){
        Calc calc1 = new Calc();
        assertFalse("Diff is more than 10",calc1.getDiff(2,9));
        Calc calc2 = new Calc();
        assertTrue("Diff is less than 10",calc2.getDiff(2,23));
    }
}