package u02_auswahl_3;

import util.Input;

public class AE03_MinVonDreiZahlen {
    public static void main(String[] args) {
        int a = Input.readInt("Zahl 1:");
        int b = Input.readInt("Zahl 2:");
        int c = Input.readInt("Zahl 3:");

        if (a < b) {
            if (a < c) { System.out.println("Kleinste zahl ist " + a);}
            else { System.out.println("Kleinste Zahl ist " + c);}
        }
        else {
            if(b < c) { System.out.println("kleinste Zahl ist " + b);}
            else { System.out.println("Kleinste Zahl ist " + c);}
        }





    }
}
