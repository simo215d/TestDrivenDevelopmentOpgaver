package MetoderOpgaver.Opg11;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main main = new Main();
    public void testSwap(){
        int[]arr1 = new int[3];
        arr1[0]=2;
        arr1[1]=6;
        arr1[2]=9;
        int[]arr2 = new int[3];
        arr2[0]=5;
        arr2[1]=1;
        arr2[2]=0;
        assertEquals("arr1 swapped = (5)(1)(0) and arr2 swapped = (2)(6)(9)",main.swap(arr1,arr2));
        int[]arr3 = new int[6];
        arr3[0]=5;
        arr3[1]=42;
        arr3[2]=9;
        arr3[3]=53;
        arr3[4]=3;
        arr3[5]=10;
        int[]arr4 = new int[6];
        arr4[0]=3;
        arr4[1]=9;
        arr4[2]=19;
        arr4[3]=33;
        arr4[4]=10;
        arr4[5]=1;
        assertEquals("arr1 swapped = (3)(9)(19)(33)(10)(1) and arr2 swapped = (5)(42)(9)(53)(3)(10)",main.swap(arr3,arr4));
    }

}