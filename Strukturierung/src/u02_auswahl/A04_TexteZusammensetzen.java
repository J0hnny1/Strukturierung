package u02_auswahl;

public class A04_TexteZusammensetzen {
    public static void main(String[] args) {

        //Spieler1

        int wurf1 = util.Zufall.wuerfeln();
        int wurf2 = util.Zufall.wuerfeln();
        int summe1 = wurf1 + wurf2;
        //int punkte01 = 0;

        //Spieler2

        int wurf3 = util.Zufall.wuerfeln();
        int wurf4 = util.Zufall.wuerfeln();
        int summe2 = wurf3 + wurf4;
        //int punkte1 = 0;

        if (summe1 > summe2){
          int punkte01 = 2;
            System.out.println("Punkte(Spieler1):" + punkte01);

        }
        if (summe2 > summe1){
            int punkte1 =2;
            System.out.println("Punkte(Spieler2):" + punkte1);
        }
        if (summe1 == summe2){
            System.out.println("Gleichstand");
            int punkte02 = 1;
            int punkte2 = 1;
            System.out.println("Punkte(Spieler1): " + punkte02);
            System.out.println("Punkte(Spieler2): " + punkte2);


        }


    }
}
