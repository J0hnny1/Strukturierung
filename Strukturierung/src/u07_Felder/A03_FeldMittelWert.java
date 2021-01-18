package u07_Felder;

public class A03_FeldMittelWert {
    public static void main(String[] args) {
        int[] zufall = new int[100];
        int summe = 0;

        for (int i = 0; i < zufall.length; i++) {
            zufall[i] = util.Zufall.hundert();

            summe = summe + zufall[i];
        }

        for (int i = 0; i < zufall.length; i++) {

            System.out.println(zufall[i]);
        }
        System.out.println("Summe: " + summe);
        System.out.println("Durschshcnitt: " + summe / zufall.length);
    }
}
