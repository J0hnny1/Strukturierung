package u05_whileSchleife;

public class W05_SummenGroesser20 {
    public static void main(String[] args) {
        int summe = 0;
        int zahl = 0;
        do {
            int wuerfeln = util.Zufall.wuerfeln();
            summe = summe + wuerfeln;


            if (summe < 20) {
                zahl++;
            }

            if (summe > 20) {
                System.out.println("Anzahl für benötigte Versuche: " + zahl + "");
                System.out.println("Endsumme: " + summe + "");

            }
        } while (summe < 20);



    }

}






