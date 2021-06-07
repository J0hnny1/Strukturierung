package SchiefeEbene;

public class Ebene {
    private double winkel;
    private double laenge;
    private double reibKoeff;

    public double getWinkel() {
        return winkel;
    }

    public void setWinkel(float winkel) {
        this.winkel = winkel;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(float laenge) {
        this.laenge = laenge;
    }


    public double getReibKoeff() {
        return reibKoeff;
    }

    public void setReibKoeff(float reibKoeff) {
        this.reibKoeff = reibKoeff;
    }

    public Ebene(double winkel, double laenge, double reibKoeff) {
        this.winkel = winkel;
        this.laenge = laenge;
        this.reibKoeff = reibKoeff;
    }
}
