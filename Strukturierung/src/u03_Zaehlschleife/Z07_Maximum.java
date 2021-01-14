package u03_Zaehlschleife;

public class Z07_Maximum {
    public static void main(String[] args) {

        {

            int zahl = 0;
            int groessere = 0;

            for(int b = 0; b < 18 ; b++ ) {
                zahl = util.Zufall.hundert();
                if (zahl > groessere){
                    groessere = zahl;
                }

                System.out.println(zahl);

            }
            System.out.println("GRÖßTE ZAHL: " + groessere);
        }

    }
 }

