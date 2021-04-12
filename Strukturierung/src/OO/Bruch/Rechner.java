package OO.Bruch;

public class Rechner {
    public static void main(String[] args) {
        Bruchrechner kek = new Bruchrechner(new Bruch(6,7),new Bruch(8,9));
        System.out.println(kek.getBruch1().getZähler());
        System.out.println(kek.getMultipliziert());
        System.out.println(kek.getDivision());
    }
}
