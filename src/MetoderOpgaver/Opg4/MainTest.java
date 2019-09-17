package MetoderOpgaver.Opg4;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testStars(){
        Main main = new Main();
        assertEquals("********************",main.stars(20));
    }

}