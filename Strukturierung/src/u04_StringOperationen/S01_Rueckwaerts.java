package u04_StringOperationen;

import util.Input;

public class S01_Rueckwaerts {
    public static void main(String[] args) {
        String text = Input.readString("Eingabe");
        int laenge = text.length () ;

        for(int b = laenge-1; b >= 0 ; b-- ) {
            System.out.print( text.charAt (b) + "");

        }


    }
}