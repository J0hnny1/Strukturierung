package u02_auswahl;

import jdk.jshell.execution.Util;

public class A02_verschachtelteAuswahl {
    public static void main(String[] args) {

        int wuerfel1 = util.Zufall.wuerfeln();
        int wuerfel2 = util.Zufall.wuerfeln();

        System.out.println("Spieler 1: " + wuerfel1 + " Spieler 2: " + wuerfel2);

        if (wuerfel1  > wuerfel2) {
            System.out.println("Spieler 1 hatt gewonnen");
        }

        if (wuerfel2 > wuerfel1) {
            System.out.println("Spieler 2 hat gewonnen");
        }


        if (wuerfel1 == wuerfel2) {
            System.out.println("Gleichstand");
        }


    }
}
