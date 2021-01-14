package u02_auswahl;

public class A07_EinspielerPasch {
    public static void main(String[] args) {

        int Wurf1 = util.Zufall.wuerfeln();
        int Wurf2 = util.Zufall.wuerfeln();

        int Wurf3 = util.Zufall.wuerfeln();
        int Wurf4 = util.Zufall.wuerfeln();


        System.out.println("Wurf1: " + Wurf1);
        System.out.println("Wurf1: " + Wurf2);
        System.out.println("Wurf2: " + Wurf3);
        System.out.println("Wurf2: " + Wurf4);

       if (Wurf1 == Wurf2 ){
           System.out.println("Pasch bei Wurf 1 (10 Punkte)");
           int punkte1 = 10;
       }
        int wurf12 = Wurf1 + Wurf2;
       if (wurf12 > 6){
           System.out.println("Summe von Wurf 1 Größer als 6 (5 Punkte)");
       }

       if (Wurf3 == Wurf4){
           System.out.println("Pasch bei Wurf 2(10 Punkte)");
       }

       int wurf34 = Wurf3 + Wurf4;
        if (wurf34 > 6){
            System.out.println("Summe von Wurf 2 Größer als 6 (5 Punkte)");
        }
    }
}
