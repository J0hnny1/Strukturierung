package u05_whileSchleife;

public class W04_UND_ODER {
    public static void main(String[] args) {
        int point1 = 0;
        int point2 = 0;


        //for (int a = 0; point1 < 5;a++){
        do {
            int throw1 = util.Zufall.wuerfeln();
            int throw2 = util.Zufall.wuerfeln();
            if (throw1 > throw2) {
                point1++;
            }
            if (throw2 > throw1) {
                point2++;
          }
            System.out.println(throw2);
            System.out.println(throw1);
        } while (point1 + point2 / 2 < 5);

        System.out.println("Spieler1: " + point1);
        System.out.println("Spieler2: " + point2);
    }
}
