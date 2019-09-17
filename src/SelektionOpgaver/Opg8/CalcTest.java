package SelektionOpgaver.Opg8;

import junit.framework.TestCase;

public class CalcTest extends TestCase {
    public void testCalc(){
        Dice dice1 = new Dice();
        assertEquals("en ener",dice1.getEyes(1));
        assertEquals("en firer",dice1.getEyes(4));
    }
}
