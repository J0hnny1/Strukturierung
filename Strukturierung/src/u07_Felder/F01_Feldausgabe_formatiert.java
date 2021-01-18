package u07_Felder;

public class F01_Feldausgabe_formatiert {
    public static void main(String[] args) {
        int[] zufall = new int[100];

        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = util.Zufall.hundert();
        }
        for (int i = 0; i < 19; i++) {

            System.out.println(zufall[i]);
        }
    }
}
