package MetoderOpgaver.Opg1;

import junit.framework.TestCase;

public class MainTest extends TestCase {

    public void testAdress(){
        Main main = new Main();
        assertEquals("Zealand, femovej 3, 4700",main.adress());
    }

}