package u05_whileSchleife;

public class W00_wuerfelnBis6 {
    public static void main(String[] args) {


        int wuerfeln = 0;
        //solange
        while (wuerfeln != 6){
            wuerfeln = util.Zufall.wuerfeln();
            System.out.println(wuerfeln);
        }

    }
}
