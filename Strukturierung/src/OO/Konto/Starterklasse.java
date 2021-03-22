package OO.Konto;

public class Starterklasse {
    public static void main(String[] args) {
        Kunde J = new Kunde("DE6646723", 100);

        System.out.println("Kontonummer: " + J.getKonto().getKontoNummer());
        System.out.println("Kreditlimit: " + J.getKonto().getKreditLimit());
        System.out.println("Kontostand: "+ J.getKonto().getKontoStand());

        J.getKonto().einzahlen(100);
        System.out.println("neuer Kontostand: "+ J.getKonto().getKontoStand());

        J.getKonto().auszahlen(25);
        System.out.println("neuer Kontostand: " + J.getKonto().getKontoStand());

        J.getKonto().auszahlen(250);
        System.out.println();
    }
}

