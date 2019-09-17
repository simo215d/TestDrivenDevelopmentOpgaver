package SelektionOpgaver.Opg6;

public class Calc {

    public int findMid(int x, int y, int z) {
        int midNumber = 0;
        if (z>=x && x>=y || y>=x && x>=z){
            midNumber = x;
        } else if (z>=y && y>=x || x>=y && y>=z){
            midNumber = y;
        } else if (x>=z && z>=y || y>=z && z>=x){
            midNumber = z;
        }
        return midNumber;
    }
}
