package MetoderOpgaver.Opg15;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testTilskud(){
        //Du kan antage at parameteren ikke er negativ og at det er et heltal.
        Main main = new Main();
        assertEquals("4 kr",main.tilskud(9));
    }
}