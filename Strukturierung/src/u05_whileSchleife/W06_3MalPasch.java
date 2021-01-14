package u05_whileSchleife;

public class W06_3MalPasch {
    public static void main(String[] args) {

        int point = 0;
        int count = 0;
        int count2 = 0;
        for (int a = 0; a < 3;a++)
        do {
            int throw1 = util.Zufall.wuerfeln();
            int throw2 = util.Zufall.wuerfeln();
            if (throw1 == throw2){
                point++;
                count2++;
            }
            count++;
        }while (count2 < 3);
        System.out.println("Anzahl WÜrfe: " + count);
    }
}
