package Sortierung_Methode;

public class feldAusgeben {
    public static void main(String[] args) {
        int b [] = {1,2,3,4,5,6,7};
        feldAusgeben(b);
    }
    static void feldAusgeben(int [] a){
     for (int i = 0; i < a.length;i++){
         System.out.print(a[i] + " ");
     }
        System.out.println();
    }
}
