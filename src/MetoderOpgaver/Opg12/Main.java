package MetoderOpgaver.Opg12;

public class Main {
    //opgave 12.1
    public String theSmallOneOut(int[] arr1) {
        String result = "";
        int smallestNum = arr1[0];
        int smallestNumPos = 0;
        int secondSmallestNum = arr1[0];
        int secondSmallestNumPos = 0;
        //find smallest number
        for (int i=0; i<arr1.length;i++){
            if (arr1[i]<=smallestNum){
                smallestNumPos = i;
                smallestNum = arr1[smallestNumPos];
            }
        }
        //find second smallest number
        for (int i=0; i<arr1.length;i++){
            if (arr1[i]<=secondSmallestNum && i!=smallestNumPos){
                secondSmallestNumPos = i;
                secondSmallestNum = arr1[secondSmallestNumPos];
                arr1[smallestNumPos] = arr1[secondSmallestNumPos];
            }
        }
        //building string result
        for (int i=0;i<arr1.length;i++){
            result += "("+arr1[i]+")";
        }
        return result;
    }
    //opgave 12.2
    public String theSmallOneOut2(int[] arr1) {
        String result = "";
        int smallestNum = arr1[0];
        int smallestNumPos = 0;
        int secondSmallestNum = arr1[0];
        int secondSmallestNumPos = 0;
        int helpNumber = Integer.MAX_VALUE;
        int helpNumberPos;
        //find smallest number
        for (int i=0; i<arr1.length;i++){
            if (arr1[i]<=smallestNum){
                smallestNumPos = i;
                smallestNum = arr1[smallestNumPos];
            }
        }
        //find second smallest number
        for (int i=0; i<arr1.length;i++){
            if (arr1[i]<=secondSmallestNum && i!=smallestNumPos){
                secondSmallestNumPos = i;
                secondSmallestNum = arr1[secondSmallestNumPos];
                arr1[smallestNumPos] = arr1[secondSmallestNumPos];
            }
        }
        //if secondsmallest == smallest så sæt secondsmallest til den mindste værdi der er større end den selv
        if (secondSmallestNum == smallestNum){
            for (int i=0; i<arr1.length;i++){
                if (arr1[i]>smallestNum && arr1[i]<=helpNumber){
                    helpNumberPos = i;
                    helpNumber = arr1[helpNumberPos];
                    arr1[smallestNumPos] = arr1[helpNumberPos];
                }
            }
        }
        //building string result
        for (int i=0;i<arr1.length;i++){
            result += "("+arr1[i]+")";
        }
        return result;
    }
}
