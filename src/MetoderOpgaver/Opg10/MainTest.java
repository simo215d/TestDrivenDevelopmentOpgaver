package MetoderOpgaver.Opg10;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main main = new Main();
    public void testMax(){
        int[]arr1 = new int[3];
        arr1[0]=2;
        arr1[1]=5;
        arr1[2]=9;
        int[]arr2 = new int[3];
        arr2[0]=4;
        arr2[1]=5;
        arr2[2]=1;
        assertEquals("first(max) = (4)(5)(9) and second (4)(5)(1)",main.max(arr1,arr2));
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
        assertEquals("first(max) = (5)(42)(19)(53)(10)(10) and second (3)(9)(19)(33)(10)(1)",main.max(arr3,arr4));
    }

}