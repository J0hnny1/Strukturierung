package SchiefeEbene;

public class Main {
    public static void main(String[] args) {
        double masse = util.Input.readDouble("Masse des Körpers:");
        Koerper körper = new Koerper(69);
        double winkel = util.Input.readDouble("Was ist der Winkel der Ebene?");
        double laenge = util.Input.readDouble("Was ist die Länge der Ebene?");
        double reibKoeff = util.Input.readDouble("Was ist der Reibungskooeffizient der Ebene?");
        Ebene ebene1 = new Ebene(winkel, laenge, reibKoeff);
    }

    //public Kraft KraftBerechnenGewichtskraft(double masse, double ortsfaktor, double reibungsKoeff, double winkel) {
        //Kraft kraft = new Kraft();
        //return kraft;
    //}
}
