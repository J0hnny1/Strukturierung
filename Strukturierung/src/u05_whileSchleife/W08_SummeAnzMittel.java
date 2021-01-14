package u05_whileSchleife;


import util.Input;

public class W08_SummeAnzMittel {
    public static void main(String[] args) {
        int input = Input.readInt("Eingabe: ");
        int sum = 0;
        int numbers = 0;

        while (true) {
            int eingabe = Input.readInt("Gebe eine Zahl an");
            if (eingabe == -1) break;
            sum += eingabe;
            numbers++;
        }
        

        System.out.println("Mittelwert: " + ((double) sum / numbers));
        System.out.println("Anzahl: " + numbers);
    }
}

