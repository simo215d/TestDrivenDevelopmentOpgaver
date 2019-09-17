package SelektionOpgaver.Opg2;

import junit.framework.TestCase;

public class Opgave2Test extends TestCase {
    public void testCalc1() {
        Opgave2 calc1 = new Opgave2();
        assertEquals("Summen er større end hundrede",calc1.sumCheck(41,67));
    }

    public void testCalc2() {
        Opgave2 calc1 = new Opgave2();
        assertEquals("Summen er ikke større end hundrede",calc1.sumCheck(35,20));
    }
}