package u07_Felder;

public class F03_Wahrheitsfeld {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            int wurf1 = util.Zufall.wuerfeln();
            int wurf2 = util.Zufall.wuerfeln();
            if (wurf1 == wurf2) {
                System.out.println("Wurf " + i + " ein Pasch");
            }else System.out.println("Wurf " + i + " kein Pasch");
        }
    }
}
