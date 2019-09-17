package SelektionOpgaver.Opg5;

public class Calc {

    public String findX(int x) {
        int testX;
        testX = x%10;
        return x+" tilhøre ["+(x-testX)+":"+((x-testX)+9)+"]";
    }
}
