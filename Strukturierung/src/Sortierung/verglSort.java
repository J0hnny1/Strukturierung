package Sortierung;

import util.Input;

public class verglSort {
    public static void main(String[] args) {
        // Array
        int[] data = new int[100];
        // Array befüllen
        for (int i = 0; i < data.length; i++) {
            data[i] = i;
        }
        // Suchzahl
        int suchzahl = Input.readByte("Bitte geben Sie eine zu suchenden Zahl ein.");

        //Aufrufe für die unterschiedlichen Methoden
        int pos = linSearch1(data, suchzahl);
        //int pos = linSearch2(data, suchzahl);
        //int pos = binSearch1(data,suchzahl);
        //int pos = binSearch2(data,suchzahl,0,data.length-1);


        // Ausgabe
        System.out.println("Die gesuchte Zahl steht an Position " + pos);
        System.out.println("Suchzahl " + suchzahl);
        System.out.println("Zahl in Array an Position " + pos + " ist die Zahl " + data[pos]);
    }

    static int linSearch1(int[] array, int number) {
        int erg = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                erg = i;
            }
        }
        return erg;
    }

    static int linSearch2(int[] array, int number) {
        int erg = -1;
        int i = 0;
        while (erg != number) {
            if (array[i] == number) {
                erg = i;
            }
            i++;
        }
        return erg;
    }

    static int binSearch1(int[] array, int number) {
        int erg = -1;
        int mitte = array.length / 2; // Definition der Mitte des Arrays
        int liGr = 0;               // Linke Grenze
        int reGr = array.length - 1;  // Rechte Grenze

        while (liGr != reGr) {
            // Wenn die gesuchte Zahl der Mitte des Arrays entspricht, wird die Suche beendet.
            if (number == array[mitte]) {
                erg = mitte;
                liGr = reGr;  //Abbruchbedingung der while-Schleife
            } else {
                if (number > array[mitte]) {     //Anpassen der Grenzen
                    liGr = mitte;      // Da die gesuchte Zahl oberhalb der Mitte liegt
                    // wird die neue linke Grenze auf die alte Mitte gesetzt.
                } else {
                    reGr = mitte;     // neue rechte Grenze wird auf die alte Mitte gesetzt.
                }
            }
            mitte = (liGr + reGr) / 2;      // Berechnung der alten Mitte
        }
        return erg;
    }

    static int binSearch2(int[] array, int number, int liGr, int reGr) {
        int erg = -1;
        int mitte = (liGr + reGr) / 2; // Berechnung der Mitte
        // Wenn die gesuchte Zahl der Mitte des Arrays entspricht, wird die Suche beendet.
        if (number == array[mitte]) {
            erg = mitte;
        } else {
            if (number < array[mitte]) {
                // Anpassen der Grenze über Eingabe der alten Mitte als neue Grenze
                erg = binSearch2(array, number, liGr, mitte);
            } else {
                erg = binSearch2(array, number, mitte, reGr);
            }
        }
        return erg;
    }
}

