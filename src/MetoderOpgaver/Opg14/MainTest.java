package MetoderOpgaver.Opg14;

import junit.framework.TestCase;

public class MainTest extends TestCase {
    Main main = new Main();
    public void testAdd(){
        int x = 2;
        int y = 7;
        assertEquals(9,main.add(x,y));
        x = -1;
        y = 6;
        assertEquals(5,main.add(x,y));
    }
    public void testSub(){
        int x = 7;
        int y = 1;
        assertEquals(6,main.sub(x,y));
        x = 6;
        y = -12;
        assertEquals(18,main.sub(x,y));
    }
    public void testMul(){
        int x = 2;
        int y = 2;
        assertEquals(4,main.mul(x,y));
        x = -6;
        y = 2;
        assertEquals(-12,main.mul(x,y));
    }
    public void testDiv(){
        int x = 10;
        int y = 5;
        assertEquals(2,main.div(x,y));
        x = -2;
        y = 1;
        assertEquals(-2,main.div(x,y));
    }
    public void testMod(){
        int x = 27;
        int y = 10;
        assertEquals(7,main.mod(x,y));
        x = -5;
        y = 3;
        assertEquals(-2,main.mod(x,y));
    }
    public void test14_3_A(){
        assertEquals(61,main.add(main.mul(5,10),11));
    }

    public void test14_3_B(){
        assertEquals(-43,main.sub((main.div(7,3)),(main.mul(9,5))));
    }

    public void test14_3_C(){
        assertEquals(48,main.mul(4,(main.add(3,9))));
    }
    public void test14_3_D(){
        assertEquals(1,main.mod(main.add(main.div(9,4),8),3));
    }
    public void test14_3_E(){
        assertEquals(12,main.add(main.mod(main.add(main.div(9,1),9),3),12));
    }

    public void test14_4(){
        //test med int
        assertEquals(16,main.pow(2,4));
    }

    public void test14_5(){
        assertEquals(100,main.sqr(10));
    }

    public void test14_6(){
        assertEquals(23,main.abs(-23));
    }

    public void test14_7(){
        assertEquals(17,main.poly3(2));
    }

    public void test14_8(){
        assertEquals(4.0,main.sqrt(16));
    }
}