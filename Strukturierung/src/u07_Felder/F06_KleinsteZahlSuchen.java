package u07_Felder;

import java.util.Arrays;

public class F06_KleinsteZahlSuchen {
    public static void main(String[] args) {
        int[] a = new int[20];

        for (int i = 0; i < a.length;i++) {
            a[i] = util.Input.readInt("zahl");
        }
        System.out.println("Kleinste Zahl: " + Arrays.stream(a).min());

    }
}
