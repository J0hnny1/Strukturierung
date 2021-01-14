package u03_Zaehlschleife;

public class Z08_Anzahl6 {
    public static void main(String[] args) {

        int sechs = 0;
        int summe = 0;
        for(int b = 0; b < 30 ; b++ ) {

            int zahl = util.Zufall.wuerfeln();

            System.out.print( zahl + ",");


            if (zahl == 6){
                sechs ++;
            }

        }
        System.out.println("Anzahl an sechsern:" + sechs );

    }
}
