package OO.Bruch;

public class Rechner {
    public static void main(String[] args) {
        //Bruchrechner ko = new Bruchrechner(new Bruch(6,7),new Bruch(8,9));
        int z1 = util.Input.readInt("z1");
        int n1 = util.Input.readInt("n1");
        int z2 = util.Input.readInt("z2");
        int n2 = util.Input.readInt("n2");
        Bruchrechner kek = new Bruchrechner(new Bruch(z1,n1),new Bruch(z2,n2));

        System.out.println("Bruch1: " + kek.getBruch1().getZähler() + "/" + kek.getBruch1().getNenner());
        System.out.println("Bruch2: " + kek.getBruch2().getZähler() + "/" + kek.getBruch2().getNenner());
        System.out.println("Multipliziert: "+ kek.getMultipliziert());
        System.out.println("Dividiert: "+ kek.getDivision());
        System.out.println("Addition: " + kek.getAddition());
        System.out.println("Subtraktion: "+ kek.getSubtraktion());
    }
}
