package AF05_Struktogramme;

import util.Input;

public class optest {
    public static void main(String[] args) {

        int eingabe1 = Input.readInt("aajg");
        int eingabe2 = Input.readInt("asd");
       char Eingabe = Input.readChar("Operator:");
        System.out.println(Eingabe);

        switch (Eingabe){
            case'*': System.out.println(eingabe1 * eingabe2);

        }
    }
}
