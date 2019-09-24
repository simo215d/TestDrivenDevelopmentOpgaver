package MetoderOpgaver.Opg14;

public class Main {
    public int add(int x, int y) {
        int result = x+y;
        return result;
    }

    public int sub(int x, int y) {
        int result = x-y;
        return result;
    }

    public int mul(int x, int y) {
        int result = x*y;
        return result;
    }

    public int div(int x, int y) {
        int result = x/y;
        return result;
    }

    public int mod(int x, int y) {
        int result = x%y;
        return result;
    }

    public int pow(int i, int j) {
        int result = (int)Math.pow(i,j);
        return result;
    }

    public int sqr(int i) {
        int result = (int)Math.pow(10,2);
        return result;
    }

    public int abs(int i) {
        int result = Math.abs(i);
        return result;
    }

    public int poly3(int i) {
        int result = (int) Math.pow(i,3)+(3*((int) Math.pow(i,2))+i-5);
        return result;
    }

    public double sqrt(double i) {
        double result = Math.pow(i,0.5);
        return result;
    }
}
