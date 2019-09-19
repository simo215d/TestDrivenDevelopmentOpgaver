package MetoderOpgaver.Opg12;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testTheSmallOneOut(){
        Main main = new Main();
        int[]arr1 = new int[3];
        arr1[0]=7;
        arr1[1]=2;
        arr1[2]=9;
        assertEquals("(7)(7)(9)",main.theSmallOneOut(arr1));
        int[]arr2 = new int[8];
        arr2[0]=5;
        arr2[1]=2;
        arr2[2]=8;
        arr2[3]=4;
        arr2[4]=0;
        arr2[5]=3;
        arr2[6]=1;
        arr2[7]=4;
        assertEquals("(5)(2)(8)(4)(1)(3)(1)(4)",main.theSmallOneOut(arr2));
        int[]arr3 = new int[3];
        arr3[0]=7;
        arr3[1]=7;
        arr3[2]=9;
        //denne test fejler, da 7 bare bliver sat til 7.
        //assertEquals("(7)(9)(9)",main.theSmallOneOut(arr3));
        //derfor laver vi en opgave 12.2 som modificere metoden, så
    }
    public void testTheSmallOneOut2(){
        Main main = new Main();
        int[]arr3 = new int[3];
        arr3[0]=7;
        arr3[1]=7;
        arr3[2]=9;
        assertEquals("(7)(9)(9)",main.theSmallOneOut2(arr3));
        int[]arr2 = new int[8];
        arr2[0]=5;
        arr2[1]=2;
        arr2[2]=8;
        arr2[3]=4;
        arr2[4]=1;
        arr2[5]=3;
        arr2[6]=1;
        arr2[7]=4;
        assertEquals("(5)(2)(8)(4)(1)(3)(2)(4)",main.theSmallOneOut2(arr2));
    }
}