package SelektionOpgaver.Opg7;

public class Calc {

    public boolean getDiff(int x, int y) {
        int diff = x-y;
        if(Math.abs(diff)>10){
            return true;
        } else {
            return false;
        }
    }
}
