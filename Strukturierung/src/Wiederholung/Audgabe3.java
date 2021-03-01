package Wiederholung;

import java.util.Random;

public class Audgabe3 {
    public static void main(String[] args) {
        //"random" class für zufallszahlen
        Random random = new Random();
        int z[] = new int[200];
        int sum = 0;
        int c = 0;
        for (int i = 0; i < z.length; i++) {
            z[i] = random.nextInt(100);
            sum = sum + z[i];
            if (z[i] == 100) {
                c++;
            }
        }
        for (int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
        System.out.println("Summe: " + sum);
        System.out.println("Anzahl an Hundert: " + c);

        String kek = "topkek";
        String kek2 = "nicht top kek";
        System.out.println(kek.indexOf("kek"));
        kek(3);
        System.out.println(kek(3));
        int[][] koo = {
                {3,5,7},
                {6,8,0,55}
        };
        System.out.println(koo[0][1]);

    }

    static int kek(int i){

        return i*3;
    }
}
