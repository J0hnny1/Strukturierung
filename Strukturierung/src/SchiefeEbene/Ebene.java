package SchiefeEbene;

public class Ebene {
    private float winkel;
    private float laenge;
    private double reibKoeff;

    public float getWinkel() {
        return winkel;
    }

    public void setWinkel(float winkel) {
        this.winkel = winkel;
    }

    public float getLaenge() {
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

    public Ebene(float winkel, float laenge, double reibKoeff) {
        this.winkel = winkel;
        this.laenge = laenge;
        this.reibKoeff = reibKoeff;
    }
}
