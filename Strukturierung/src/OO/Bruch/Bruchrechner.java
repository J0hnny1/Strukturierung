package OO.Bruch;

public class Bruchrechner {
    private Bruch bruch1;
    private Bruch bruch2;

    public Bruchrechner(Bruch bruch1, Bruch bruch2) {
        this.bruch1 = bruch1;
        this.bruch2 = bruch2;
    }

    public Bruch getBruch1() {
        return bruch1;
    }

    public Bruch getBruch2() {
        return bruch2;
    }

    public String getMultipliziert (){
        float a = bruch1.getNenner() * bruch2.getNenner();
        float b = bruch1.getZähler() * bruch2.getZähler();
        String c = b + "/" + a;
        return c;
    }
    public String getDivision (){
        float a = bruch1.getZähler() * bruch2.getNenner();
        float b = bruch1.getNenner() * bruch2.getZähler();
        String c = a + "/" + b + ", " + a/b;
        return c;
    }
    public float getAddition (){
        float a = bruch1.getZähler() * bruch2.getNenner() + bruch2.getZähler() * bruch1.getNenner();
        float b = bruch1.getNenner() * bruch2.getNenner();
        return a/b;
    }
    public float getSubtraktion (){
        float a = bruch1.getZähler() * bruch2.getNenner() - bruch2.getZähler() * bruch1.getNenner();
        float b = bruch1.getNenner() * bruch2.getNenner();
        return a/b;
    }
}
