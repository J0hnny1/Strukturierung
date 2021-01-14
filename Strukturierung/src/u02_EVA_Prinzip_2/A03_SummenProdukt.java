package u02_EVA_Prinzip_2;


import util.Input;

public class A03_SummenProdukt {

    public static void main(String[] args) {


        int zahl1;
        int zahl2;
        int zahl3;

        zahl1 = Input.readInt("Zahl1" );

        zahl2 = Input.readInt("Zahl2:" );

        zahl3 = Input.readInt("Zahl3:");

        int ergebniss = zahl1 + zahl2 +zahl3;

        System.out.println("Ergebniss: " + ergebniss);

        int multi = Input.readInt("Zahl4: " );

        int result = ergebniss * multi;
        System.out.println("Endergebniss: " + result);

    }

}