package Aaefü;

import util.Input;

public class Übungsaufgaben1 {
    public static void main(String[] args) {

        int divident = Input.readInt("Eingabe Divident");
        int divisor = Input.readInt("Eingabe Divisor:");

        if (divisor == 0) {
            System.out.println("Division durch 0 nicht Möglich!");
            System.out.println("Geben sie bitte eine andere Zahl als 0 ein. ");
        }
        else {
            System.out.println(divident / divisor);
        }

    }
}
