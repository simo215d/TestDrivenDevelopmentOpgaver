package MetoderOpgaver.Opg8;

import junit.framework.TestCase;

public class LOLTest extends TestCase {
    public void testInc(){
        LOL lol = new LOL();

        int[] arr1 = new int[3];
        arr1[0]=1;
        arr1[1]=3;
        arr1[2]=4;
        assertEquals("245",lol.inc(arr1));

        int[] arr2 = new int[2];
        arr2[0]=3;
        arr2[1]=2;
        assertEquals("43",lol.inc(arr2));
    }

}