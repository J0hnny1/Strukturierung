package AF05_Struktogramme;

import util.Input;

public class Übungsaufgaben2 {
    public static void main(String[] args) {

        int Radikant = Input.readInt("Radikant:");

        if (Radikant < 0 ){

            System.out.println("Aus negativen Radikanten kann keine Wurzelberechnung erfolgen!");
        }
        else{
            double Ergebnis = Math.sqrt (Radikant);
            System.out.println(Ergebnis);

        }

    }
}
