package u07_Felder;

public class A01_Feldfuellen {
    public static void main(String[] args) {
        int[] zufall = new int[100];

        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = util.Zufall.hundert();
        }
        for (int i = 0; i < zufall.length; i++) {

            System.out.println(zufall[i]);
        }
    }
}
