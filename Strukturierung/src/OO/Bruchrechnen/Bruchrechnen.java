package OO.Bruchrechnen;

public class Bruchrechnen {
    public static void main(String[] args) {
        Bruch a = new Bruch(3, 6);
        Bruch b = new Bruch(4, 5);
        Bruch c = new Bruch();
        a.print();
        b.print();
        multiplikation(a, b);
        c.setZaehler(7);
        c.setNenner(6);

    }

    static Bruch multiplikation(Bruch pa, Bruch pb){
        Bruch c = new Bruch(pa.getZaehler() * pb.getZaehler(),pa.getNenner() * pb.getNenner() );
        System.out.println("Die Multiplikation der Brüche a");
        System.out.println(pa.getZaehler());
        System.out.println("--");
        System.out.println(pa.getNenner());
        System.out.println("und b");
        System.out.println(pb.getZaehler());
        System.out.println("--");
        System.out.println(pb.getNenner());
        System.out.println("liefert den Bruch c");
        System.out.println(c.getZaehler());
        System.out.println("--");
        System.out.println(c.getNenner());
        return c;
    }
}
