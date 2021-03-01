package u07_Felder;

public class F04_ZahlMitIndexSuchen {
    public static void main(String[] args) {
        int[] a = new int[21];
        for (int i = 1; i < 21;i++) {
            a[i] = util.Zufall.hundert();

        }System.out.println("Fertig!");
        int i = util.Input.readInt("Index:");
        System.out.println(a[i]);
    }

}
