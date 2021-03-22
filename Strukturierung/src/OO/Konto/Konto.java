package OO.Konto;

public class Konto {
    private final String kontoNummer;
    private double kontoStand;
    private double kreditLimit;

    public Konto(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public String getKontoNummer() {
        return kontoNummer;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public void einzahlen(double betrag) {
        this.kontoStand += Math.abs(betrag);
    }

    public void auszahlen(double betrag) {
        if (this.kreditLimit + this.kontoStand < betrag){
            System.out.println("Diese Transaktion ist nicht Möglich!");
        }else kontoStand -= betrag;

    }
}
