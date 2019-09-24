package MetoderOpgaver.Opg15;

import java.util.Scanner;

public class xd {
    public static void main(String[] args) {
        /*
        for (int i = 0; i<=10; i++){
            System.out.println(i);
        }

        for (int i = -2; i>=-1000; i--){
            System.out.println(i);
        }

        for (int i = 42; i<=77; i+=5){
            System.out.println(i);
        }

        for (int i = 10; i>=0; i-=2){
            System.out.println(i*7);
        }
        */
        int i = 1;
        while (i<=5){
            System.out.println("Hej"+i);
            i++;
        }
        Scanner input = new Scanner(System.in);
        String besked = "";
        while (!besked.equals("exit")){
            besked = input.next();
            System.out.println("Din besked er: "+besked);
        }
        int x = 0;
        do {
            System.out.println("ASDASDA");
        }while (x>0);
    }
}
