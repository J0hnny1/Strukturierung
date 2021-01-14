package u03_Zaehlschleife;

import util.Input;

public class SchleifeMitEingabe {
    public static void main(String[] args) {
        //int i = util.Eingabe.readInt("Anfang der Reihe:");
        //int zahl = util.Eingabe.readInt("Ende der Reihe:");

        int zahl = Input.readInt("Ende der Reihe:");
        System.out.println("Quadratzahlen von 1 - " + zahl + ".");


        for (int i = Input.readInt("Anfang der Reihe"); i <= zahl; i++){

            System.out.println(i + ": " + Math.pow(i,2));
        }


    }
}
