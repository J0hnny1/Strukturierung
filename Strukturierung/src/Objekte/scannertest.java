package Objekte;

import java.util.Scanner;

public class scannertest {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        System.out.println("Willst du dich (1) Ausruhen,(2) Trainieren(3) fortfahren");
        int choice = ch.nextInt();
    }
}
