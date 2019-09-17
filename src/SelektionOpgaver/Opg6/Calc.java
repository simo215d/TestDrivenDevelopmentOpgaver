package SelektionOpgaver.Opg6;

public class Calc {

    public int findMid(int x, int y, int z) {
        if (z>=x && x>=y || y>=x && x>=z){
            return x;
        } else if (z>=y && y>=x || x>=y && y>=z){
            return y;
        } else {
            return z;
        }
    }
}
