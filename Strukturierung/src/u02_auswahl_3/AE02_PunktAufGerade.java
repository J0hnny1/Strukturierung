package u02_auswahl_3;

import util.Input;

public class AE02_PunktAufGerade {
    public static void main(String[] args) {

        int eingabex = Input.readInt("X:" );
        int eingabey = Input.readInt("Y: ");

        int ergebniss = 5 * eingabex - 3;
        if (ergebniss == eingabey){
            System.out.println("Der Punkt liegt auf der geraden");
        }
        else {
            System.out.println("Der Punkt liegt nicht auf der geraden");
        }


    }
}
