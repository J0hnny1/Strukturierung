package u03_Zaehlschleife;

import util.Zufall;

public class Z03_Zufallszahlen {
    public static void main(String[] args) {
        int zahl = 12;
        for (int i = 1; i < zahl; i++){
            System.out.println(Zufall.hundert());
        }
    }
}
