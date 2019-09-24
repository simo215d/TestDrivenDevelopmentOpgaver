package MetoderOpgaver.Opg16;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testBestået(){
        Main main = new Main();
        int[] arr1 = new int[8];
        arr1[0] = 7;
        arr1[1] = 7;
        arr1[2] = 10;
        arr1[3] = 12;
        arr1[4] = 7;
        arr1[5] = 10;
        arr1[6] = 12;
        arr1[7] = 10;
        assertEquals("Pass",main.bestået(arr1));
        arr1[0] = 4;
        assertEquals("Fail",main.bestået(arr1));
        arr1[0] = 7;
        arr1[1] = 6;
        arr1[2] = 5;
        arr1[3] = 5;
        arr1[4] = 5;
        arr1[5] = 5;
        arr1[6] = 5;
        arr1[7] = 6;
        assertEquals("Fail",main.bestået(arr1));
    }
}