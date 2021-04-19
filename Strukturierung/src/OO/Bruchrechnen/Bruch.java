package OO.Bruchrechnen;

public class Bruch {
    private  int zaehler;
    private  int nenner;

    public Bruch(int pzaehler, int pnenner) {
        this.zaehler = pzaehler;
        this.nenner = pnenner;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public Bruch() {

    }

    public int getZaehler() {
        return zaehler;
    }

    public int getNenner() {
        return nenner;
    }
    void print(){
        System.out.println(this.zaehler);
        System.out.println("--");
        System.out.println(this.nenner);
    }
}
