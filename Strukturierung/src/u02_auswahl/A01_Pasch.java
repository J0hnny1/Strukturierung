package u02_auswahl;

public class A01_Pasch {
    public static void main(String[] args) {

        int wuerfel1 = util.Zufall.wuerfeln();
        int wuerfel2 = util.Zufall.wuerfeln();
        if (wuerfel1 == wuerfel2) {
            System.out.println("Würfel1:" + wuerfel1 + "Würfel2: " + wuerfel2);

            System.out.println("Pasch, du hast gewonnen");
        }
        else {
            System.out.println("Würfel1: " + wuerfel1 + "Würfel2: " + wuerfel2);
            System.out.println("Du hast verloren versuche es erneut");
        }

    }
}
