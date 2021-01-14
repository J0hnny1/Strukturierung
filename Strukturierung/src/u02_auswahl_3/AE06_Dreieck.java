package u02_auswahl_3;

import util.Input;

public class AE06_Dreieck {
    public static void main(String[] args) {
        int a = Input.readInt("Seite a:");
        int b = Input.readInt("Seite b:");
        int c = Input.readInt("Seite c:");

        if (a > b) {
            if (a > c) { //System.out.println("Größte zahl ist " + a);
            int d = b + c;
            if (a < d){
                System.out.println("Ein Dreieck kann konstruirt werden");
            }

            }
            else { //System.out.println("Größte Zahl ist " + c);
            int e = a + b;
            if (c < e){
                System.out.println("Ein Dreieck kann konstruiert werden");
            }

            }
        }
        else {
            if(b > c) { //System.out.println("Größte Zahl ist " + b);
            int f = a + c;
            if (b < f){
                System.out.println("Ein Dreieck kann konstruiert werden");
            }

            }
            else { //System.out.println("Kleinste Zahl ist " + c);
            int g = a + b;
            if (c < g){
                System.out.println("Ein Dreieck kann konstruiert werden");
            }

            }
        }


    }
}
