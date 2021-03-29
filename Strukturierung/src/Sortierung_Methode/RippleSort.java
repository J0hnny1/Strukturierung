package Sortierung_Methode;

public class RippleSort {
    public static void main(String[] args) {


    }

    static void rippleSort(int[] feld) {
        for (int i = 0; i < feld.length - 1; i++) {
            for (int j = 0; i < feld.length; j++) {
                if (feld[j] < feld[i]) {
                    int save = feld[i];
                    feld[i] = feld[j];
                    feld[j] = save;
                }
            }
        }
    }
}

