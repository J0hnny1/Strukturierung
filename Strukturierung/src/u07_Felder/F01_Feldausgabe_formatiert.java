package u07_Felder;

public class F01_Feldausgabe_formatiert {
    public static void main(String[] args) {
        int[] zufall = new int[100];

        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = util.Zufall.hundert();
        }
        for (int x = 0; x < 5; x++) {
            System.out.println();
            for (int i = 0; i < 19; i++) {
                //x++;
                System.out.print(zufall[i]);

            }
        }
    }
}