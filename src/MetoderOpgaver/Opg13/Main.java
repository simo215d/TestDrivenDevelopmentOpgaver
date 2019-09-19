package MetoderOpgaver.Opg13;

import java.sql.PreparedStatement;

public class Main {
    public boolean erDetPrimtal(int i) {
        //et primtal er et tal der kun kan deles med 1 og tallet selv
        boolean isPrime = true;
        //vi ved at alle tal kan deles med 1, så den behøver vi ikke teste
        //vi behøver ikke at dele med tal over kvadratroden af i,
        //da vi kan få alle tal ved at gange kvadratroden med et der er <= kvadratroden.
        //eg 16: 1 går op 16 gange. 2 går op 8 gange. 4 går op 4 gange. 8 går op 2 gange. 16 går op 1 gang.
        //når vi når kvadratroden af 16=4, så bruge vi samme tal bare omvendt.
        for (int factor=2;factor<=Math.sqrt(i);factor++){
            if (i%factor == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public String getPrimes(){
        String result = "";
        for (int i=2;i<=100;i++){
            if (erDetPrimtal(i)){
                result += i+",";
            }
        }
        return result;
    }
}
