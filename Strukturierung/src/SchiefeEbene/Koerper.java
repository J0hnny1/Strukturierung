package SchiefeEbene;

public class Koerper {
    private double masse;
    private String name;

    public String getName() {
        return name;
    }



    public double getMasse() {
        return masse;
    }

    public void setMasse(double masse) {
        this.masse = masse;
    }

    public Koerper(double masse) {
        this.masse = masse;
    }
}
