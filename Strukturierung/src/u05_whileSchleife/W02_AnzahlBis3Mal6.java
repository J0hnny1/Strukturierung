package u05_whileSchleife;

public class W02_AnzahlBis3Mal6 {
    public static void main(String[] args) {
        int wuerfeln = 0;
        //solange
        int count = 0;
        int six = 0;
            while (six != 3) {
                wuerfeln = util.Zufall.wuerfeln();
                System.out.println(wuerfeln);
                count++;
                if (wuerfeln == 6){
                    six ++;
                }


            }

        System.out.println("count: " + count);
    }
 }

