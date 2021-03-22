package OO.Konto;

public class Kunde {
    private final Konto konto;

    public Kunde(String kontonummer, double kreditlimit) {
        this.konto = new Konto(kontonummer);
        this.konto.setKreditLimit(kreditlimit);
    }

    public Konto getKonto() {
        return konto;
    }
}
