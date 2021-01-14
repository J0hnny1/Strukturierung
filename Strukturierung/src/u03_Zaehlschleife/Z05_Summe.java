package u03_Zaehlschleife;

public class Z05_Summe {
    public static void main(String[] args) {
        int summe = 0;

        for(int b = 0; b < 20 ; b++ ) {

            int zahl = util.Zufall.hundert();

            summe = zahl + summe;

            System.out.println( zahl);

        }
        System.out.println(summe);


        }
}

