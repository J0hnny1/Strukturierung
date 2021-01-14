package u02_auswahl;

import jdk.jshell.execution.Util;

public class A03_BerechnungVerschachtelt {
    public static void main(String[] args) {

        //Spieler1
        int wurf1 = util.Zufall.wuerfeln();
        int wurf2 = util.Zufall.wuerfeln();
        int summe1 = wurf1 + wurf2;

        //Spieler2
        int wurf3 = util.Zufall.wuerfeln();
        int wurf4 = util.Zufall.wuerfeln();
        int summe2 = wurf3 + wurf4;

System.out.println("Summe Spieler1: " + summe1);
System.out.println("Summe Spieler2: " + summe2);

        if (summe1 > summe2){
            System.out.println("Spieler 1 hatt gewonnen.");
        }

        if (summe2 > summe1){
            System.out.println("Spieler 2 hatt gewonnen.");
        }

        if (summe1 == summe2){
            System.out.println("Gleichsstand");
        }


    }
}
