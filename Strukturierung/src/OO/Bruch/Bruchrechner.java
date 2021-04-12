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

    public float getMultipliziert (){
        return (bruch1.getNenner() * bruch2.getNenner()) / (bruch1.getZähler() * bruch2.getZähler());
    }
    public float getDivision (){
        return (bruch1.getZähler() * bruch2.getNenner()) / (bruch1.getNenner() * bruch2.getZähler());
    }
}
