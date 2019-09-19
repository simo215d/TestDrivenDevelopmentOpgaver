package MetoderOpgaver.Opg10;

public class Main {
    public String max(int[] arr1, int[] arr2) {
        String first = "";
        String second = "";
        for (int x=0;x<arr1.length;x++){
            if (arr1[x]<arr2[x]){
                arr1[x]=arr2[x];
                first += "("+arr1[x]+")";
                } else {
                first += "("+arr1[x]+")";
            }
            second += "("+arr2[x]+")";
        }
        return "first(max) = "+first+" and second "+second;
    }
}
