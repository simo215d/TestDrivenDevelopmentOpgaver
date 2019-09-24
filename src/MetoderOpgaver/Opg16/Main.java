package MetoderOpgaver.Opg16;

public class Main {
    public String bestået(int[] arr1) {
        String pass = "Pass";
        String fail = "Fail";
        for (int i = 0; i<arr1.length; i++){
            if (arr1[i]<5){
                return fail;
            }
        }
        if (arr1[0]<6 || arr1[arr1.length-1]<6){
            return fail;
        }
        double gennemsnit = 0;
        for (int i = 0; i<arr1.length;i++){
            gennemsnit += arr1[i];
        }
        gennemsnit = gennemsnit/arr1.length;
        if (gennemsnit<6){
            return fail;
        } else return pass;
    }
}
