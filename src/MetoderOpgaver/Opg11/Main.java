package MetoderOpgaver.Opg11;

public class Main {
    public String swap(int[] arr1, int[] arr2) {
        String arr1String = "";
        String arr2String = "";
        for (int i=0; i<arr1.length;i++){
            int arr1i = arr1[i];
            int arr2i = arr2[i];
            arr1[i]=arr2i;
            arr2[i]=arr1i;
            arr1String += "("+arr1[i]+")";
            arr2String += "("+arr2[i]+")";
        }
        return "arr1 swapped = "+arr1String+" and arr2 swapped = "+arr2String;
    }
}
