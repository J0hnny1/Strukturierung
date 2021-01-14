package u02_auswahl_3;

import util.Input;

public class AE01_Kehrwert {
    public static void main(String[] args) {
        int eingabe = Input.readInt("Kehrwert bilden von: ");

        if (eingabe == 0){
            System.out.println("Es gibt keinen Kehrwert");
        }
        int ergebniss = 1 / eingabe;
        System.out.println("Der Kehrwert von " + eingabe + " ist " + ergebniss);


    }
}
