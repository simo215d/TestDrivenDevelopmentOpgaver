package MetoderOpgaver.Opg2;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testFejl1(){
        Main main = new Main();
        assertEquals("Fejl nummer: 5 i linje: 14",main.fejl1(14, 5));
    }

}