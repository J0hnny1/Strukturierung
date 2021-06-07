package SchiefeEbene;

public class Vektor {
    private double laenge;
    private double x0;
    private double y0;
    private double x1;
    private double y1;

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getX0() {
        return x0;
    }

    public void setX0(double x0) {
        this.x0 = x0;
    }

    public double getY0() {
        return y0;
    }

    public void setY0(double y0) {
        this.y0 = y0;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public Vektor(double x0, double y0, double x1, double y1) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        betragBerechnen();
    }

    public void betragBerechnen() {
        double x = this.x1 - this.x0;
        double y = this.y1 - this.y0;
        double c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        System.out.println(c);
    }
}
