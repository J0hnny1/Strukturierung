package OO.Konto;

public class Konto {
    private final String kontoNummer;
    private double kontoStand = 0D;
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

    public void einzahlen(double v) {
        this.kontoStand += Math.abs(v);
    }

    public void auszahlen(double v) {
        double r = this.kontoStand - Math.abs(v);

        if (r >= -kreditLimit) {
            this.kontoStand = r;
        } else {
            System.out.println("Diese Auzahlung ist nicht möglich!");
        }

    }
}
