package u07_Felder;

import util.Zufall;

import java.util.Arrays;

public class A04_MaximaleZahl {
    public static void main(String[] args) {
        int[] zufall = new int[100];

        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = Zufall.wuerfeln();
        }
        for (int i = 0; i < zufall.length; i++) {

            System.out.println(zufall[i]);
        }
        System.out.println("Größte Zahl: " + Arrays.stream(zufall).max());

    }
}
