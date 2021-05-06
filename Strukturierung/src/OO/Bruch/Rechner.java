package OO.Bruch;

public class Rechner {
    public static void main(String[] args) {
        Bruchrechner bruch1 = new Bruchrechner(new Bruch(6,7),new Bruch(8,9));
//        int z1 = util.Input.readInt("z1");
//        int n1 = util.Input.readInt("n1");
//        int z2 = util.Input.readInt("z2");
//        int n2 = util.Input.readInt("n2");
//        Bruchrechner bruch1 = new Bruchrechner(new Bruch(z1,n1),new Bruch(z2,n2));

        System.out.println("Bruch1: " + bruch1.getBruch1().getZähler() + "/" + bruch1.getBruch1().getNenner());
        System.out.println("Bruch2: " + bruch1.getBruch2().getZähler() + "/" + bruch1.getBruch2().getNenner());
        System.out.println("Multipliziert: "+ bruch1.getMultipliziert());
        System.out.println("Dividiert: "+ bruch1.getDivision());
        System.out.println("Addition: " + bruch1.getAddition());
        System.out.println("Subtraktion: "+ bruch1.getSubtraktion());
    }
}
