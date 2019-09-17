package SelektionOpgaver.Opg8;

public class Dice {

    public String getEyes(int eyes) {
        String result = null;
        switch (eyes){
            case 1:
                result = "en ener"; break;
            case 2:
                result = "en toer"; break;
            case 3:
                result = "en treer"; break;
            case 4:
                result = "en firer"; break;
            case 5:
                result = "en femmer"; break;
            case 6:
                result = "en sekser"; break;

        }
        return result;
    }
}
