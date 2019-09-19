package MetoderOpgaver.Opg9;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    public void testAdd(){
        Main main = new Main();
        int[] arr1 = new int[3];
        arr1[0]=2;
        arr1[1]=5;
        arr1[2]=1;
        int[] arr2 = new int[3];
        arr2[0]=6;
        arr2[1]=3;
        arr2[2]=8;
        assertEquals("New arr1 = 889 and arr2 = 638",main.add(arr1,arr2));

        int[] arr3 = new int[1];
        arr3[0]=5;
        int[] arr4 = new int[1];
        arr4[0]=6;
        assertEquals("New arr1 = 11 and arr2 = 6",main.add(arr3,arr4));
    }
}