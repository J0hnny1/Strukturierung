package u05_whileSchleife;

public class W01_AnzahlBis6 {
    public static void main(String[] args) {
        int wuerfeln = 0;
        //solange
        int count = 0;
        while (wuerfeln != 6){
            wuerfeln = util.Zufall.wuerfeln();
            System.out.println(wuerfeln);
            count ++;
        }
        System.out.println("count: " + count);
    }
}
