package Sortierung_Methode;

public class FeldElementTauschen {
    public static void main(String[] args) {

    }
    public static int[] swapElements(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
        return arr;
    }
}
