package MetoderOpgaver.Opg19;

import junit.framework.TestCase;

public class MetoderOpg19Test extends TestCase {
    public void testArray(){
        Opg19 opg = new Opg19();
        int[] arr1 = new int[5];
        arr1[0]=9;
        arr1[1]=4;
        arr1[2]=2;
        arr1[3]=1;
        arr1[4]=7;
        assertEquals("true par",opg.findesPar(arr1,2,4));
    }
}
