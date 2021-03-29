package Sortierung_Methode;

public class FeldGenerieren {
    public static void main(String[] args) {
        //System.out.println( feldGenerieren(100) );
        for(var i : feldGenerieren(100)) System.out.print(i+" ");
        System.out.println();
    }

    static int[] feldGenerieren(int elemente) {
        int[] a = new int[elemente];
        for (int i = 1; i < a.length; i++) {
            a[i] = util.Zufall.hundert();
        }
        return a;
    }
}
