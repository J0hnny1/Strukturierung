package u03_Zaehlschleife;

public class Z07_Mittelwert {
    public static void main(String[] args) {

        int summe = 0;

        for(int b = 0; b < 15 ; b++ ) {

            int zahl = util.Zufall.hundert();

            summe = zahl + summe;

            System.out.println( zahl);

        }
        int mittel = summe / 15;
        System.out.println("Mittelwert: " + mittel);
        System.out.println("Summe:" + summe);


    }
}
