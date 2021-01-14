package u02_auswahl_3;

import util.Input;

public class AE05_Geradenschnittpunkt {
    public static void main(String[] args) {
        double a = Input.readInt("Gleichung 1 a:");
        double b = Input.readInt("Gleichung 1 b:");
        int x1 = 0;
        double c = Input.readInt("Gleichung 2 c:");
        double d = Input.readInt("Gleichung 2 d:");
        int x2 = 0;

        double x=0;
        double y=0;

        if (b == d ){
            System.out.println("Die Geraden sind Parallel");
        }

        double ergebnis = (a - c) / (b- d);
        System.out.println(ergebnis);


    }
}
