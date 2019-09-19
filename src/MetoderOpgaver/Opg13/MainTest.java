package MetoderOpgaver.Opg13;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testErDetPrimtal(){
        Main main = new Main();
        assertTrue(main.erDetPrimtal(3));
        assertFalse(main.erDetPrimtal(12));
        assertFalse(main.erDetPrimtal(4));
        assertFalse(main.erDetPrimtal(27));
        assertFalse(main.erDetPrimtal(51));
        assertEquals("2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,",main.getPrimes());
    }
}