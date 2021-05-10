package Scanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Eingabe:");

        String eingabe = myObj.nextLine();
        System.out.println("Ausgabe: " + eingabe);

        Scanner kek = new Scanner(System.in);
        System.out.print("Eingabe2");
        String kekk = myObj.nextLine();
        System.out.print("kek: " + kekk + "," + kekk);
    }
}
