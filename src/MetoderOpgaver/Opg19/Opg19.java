package MetoderOpgaver.Opg19;

public class Opg19 {
    public String findesPar(int[] arr1, int x, int y) {
        //checker om x
        for(int i = 0; i<arr1.length;i++){
            if(arr1[i]==x && arr1[i+1]==y || arr1[i]==y && arr1[i+1]==x){
                return "true par";
            }
        }
        return "false par";
    }
}
