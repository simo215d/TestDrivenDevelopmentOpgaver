package MetoderOpgaver.Opg9;

public class Main {
    public String add(int[] arr1, int[] arr2) {
        String arr1String = "";
        String arr2String = "";
        for (int i=0;i<arr1.length;i++) {
            arr1[i]+=arr2[i];
            arr1String += arr1[i];
            arr2String += arr2[i];
        }
        return "New arr1 = "+arr1String+" and arr2 = "+arr2String;
    }
}
