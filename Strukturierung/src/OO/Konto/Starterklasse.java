package OO.Konto;

public class Starterklasse {
    public static void main(String[] args) {
        Kunde lukas = new Kunde("DE46S54DS51", 100);

        System.out.println(lukas.getKonto().getKreditLimit());
        System.out.println(lukas.getKonto().getKontoStand());

        lukas.getKonto().einzahlen(100D);
        System.out.println(lukas.getKonto().getKontoStand());

        lukas.getKonto().auszahlen(25D);
        System.out.println(lukas.getKonto().getKontoStand());

        lukas.getKonto().auszahlen(250D);
        System.out.println(lukas.getKonto().getKontoStand());
    }
}

