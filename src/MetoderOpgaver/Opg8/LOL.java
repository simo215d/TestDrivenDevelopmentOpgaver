package MetoderOpgaver.Opg8;

public class LOL {

    public String inc(int[] arr) {
        String result = "";
        for(int i=0; i<arr.length;i++){
            arr[i]+=1;
            result+=arr[i];
        }
        return result;
    }
}