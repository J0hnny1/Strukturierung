package u02_auswahl;

public class A06_ZweiSpielerBerechnen {
    public static void main(String[] args) {

        //Spieler1
        int wurf1 = util.Zufall.wuerfeln();
        int wurf2 = util.Zufall.wuerfeln();
        int ergebniss1;
        int ergebniss2;

        if (wurf1 < wurf2){
            ergebniss1 = wurf1 - wurf2;
        }
        else{
            ergebniss2 = wurf2 - wurf1;
        }

        //Spieler2
        int wurf01 = util.Zufall.wuerfeln();
        int wurf02 = util.Zufall.wuerfeln();
        int ergebniss01;
        int ergebniss02;

        if (wurf01 < wurf02){
            ergebniss01 = wurf01 - wurf02;
        }
        else {
             ergebniss02 = wurf02 - wurf1;
        }






    }
}
