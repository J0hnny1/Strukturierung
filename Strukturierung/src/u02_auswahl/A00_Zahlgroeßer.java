package u02_auswahl;

public class A00_Zahlgroeßer {

    public static void main(String[] args) {

        int zahl = util.Zufall.wuerfeln();

        if (zahl == 3){
            System.out.println("du hast gewonnen");

        } else {
            System.out.println("Du hast verloren versuche es erneut");

        }



    }
}
