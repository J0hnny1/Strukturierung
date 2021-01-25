package u07_Felder;

public class F03_Zahlhaeufigkeit {
    public static void main(String[] args) {
        int[] zufall = new int[100];
        int six = 0;
        int five = 0;
        int four = 0;
        int three = 0;
        int two = 0;
        int one = 0;

        for (int x = 0; x < 5; x++) {
            for (int i = 0; i < zufall.length; i++)
            {
                zufall[i] = util.Zufall.wuerfeln();

            }

            System.out.println();
            for (int i = 0; i < 19; i++)
            {
                if (zufall[i] == 6) six++;
                if (zufall[i] == 5) five++;
                if (zufall[i] == 4) four++;
                if (zufall[i] == 3) three++;
                if (zufall[i] == 2) two++;
                if (zufall[i] == 1) one++;
                System.out.print(zufall[i]);


            }
            System.out.println("    Sechs:" + six + " fünf:" + five + " Vier:" + four + " drei:" + three + " zwei:" + two + " eins:" + one);
            six = 0;
            five = 0;
            four = 0;
            three = 0;
            two = 0;
            one = 0;
        }
    }
}
