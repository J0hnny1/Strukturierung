package SchiefeEbene;

public class Main {
    public static void main(String[] args) {
        Koerper körper = new Koerper(80);
        Ebene ebene1 = new Ebene(winkel,laenge,reibKoeff);
        Vektor vektor = new Vektor(x0, y0, x1, y1);
        Kraefte kraft1 = new Kraefte(nameKraft);
    }
}
