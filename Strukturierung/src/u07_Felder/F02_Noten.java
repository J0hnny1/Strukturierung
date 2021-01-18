package u07_Felder;

import util.Input;

public class F02_Noten {
    public static void main(String[] args) {
        int noten[];
        noten = new int [6];
        double mittelwert = 0;
        for (int i = 0; i < noten.length;i++){
            noten[i] = Input.readInt("Bitte geben sie die Schulnote Nr." + (i+1) + " ein;");
            mittelwert = mittelwert + noten[i];
        }
        System.out.println("Der Mittelwert ist: " + mittelwert/noten.length);
    }
}
