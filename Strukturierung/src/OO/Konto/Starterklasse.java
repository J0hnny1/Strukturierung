package OO.Konto;

public class Starterklasse {
    public static void main(String[] args) {
        Kunde J = new Kunde("DE46S54DS51", 100);

        System.out.println(J.getKonto().getKreditLimit());
        System.out.println(J.getKonto().getKontoStand());

        J.getKonto().einzahlen(100D);
        System.out.println(J.getKonto().getKontoStand());

        J.getKonto().auszahlen(25D);
        System.out.println(J.getKonto().getKontoStand());

        J.getKonto().auszahlen(250D);
        System.out.println(J.getKonto().getKontoStand());
    }
}

