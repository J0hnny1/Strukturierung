package u04_StringOperationen;

import util.Input;

public class S02_Gesperrt {
    public static void main(String[] args) {

        String text = Input.readString("Eingabe");
        int laenge = text.length () ;

        int b;
        for(int i = 0; i < text.length(); i++) {
            if ( i % 2 == 0){

                System.out.print(text.charAt(i) + " ");

            }
        }



    }
}