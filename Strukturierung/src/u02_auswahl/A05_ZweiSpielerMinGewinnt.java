package u02_auswahl;

public class A05_ZweiSpielerMinGewinnt {
    public static void main(String[] args) {

        int wurf1 = util.Zufall.wuerfeln();
        int wurf2 = util.Zufall.wuerfeln();

        if (wurf1 < wurf2){
            System.out.println("Spieler 1 hatt gewonnen" + wurf1 );
            System.out.println(wurf2);
        }

        if (wurf2 < wurf1){
            System.out.println("Spieler 2 hatt gewonnen" + wurf1);
            System.out.println(wurf2);
        }

        if (wurf1 == wurf2){
            System.out.println("Niemand hatt gewonnen" + wurf1);
            System.out.println(wurf2);
        }

    }
}
