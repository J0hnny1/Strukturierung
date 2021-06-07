package SchiefeEbene;

public class Main {
    public static void main(String[] args) {
        double masse = util.Input.readDouble("Masse des Körpers:");
        Koerper körper = new Koerper(masse);
        double winkel = util.Input.readDouble("Was ist der Winkel der Ebene?");
        double laenge = util.Input.readDouble("Was ist die Länge der Ebene?");
        double reibKoeff = util.Input.readDouble("Was ist der Reibungskooeffizient der Ebene?");
        Ebene ebene1 = new Ebene(winkel,laenge,reibKoeff);
        double x0 = util.Input.readDouble("Was ist x0?");
        double x1 = util.Input.readDouble("Was ist x1?");
        double y0 = util.Input.readDouble("Was ist y0?");
        double y1 = util.Input.readDouble("Was ist y1?");
        Vektor vektor = new Vektor(x0, y0, x1, y1);
        String nameKraft = util.Input.readString("Was ist der Name der Kraft?");
        Kraefte kraft1 = new Kraefte(nameKraft);
    }
}
