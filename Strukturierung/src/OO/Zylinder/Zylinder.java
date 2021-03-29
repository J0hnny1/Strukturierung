package OO.Zylinder;

public class Zylinder {
    private double höhe;
    private double radius;

    Zylinder(double höhe, double radius) {
        this.radius = radius;
        this.höhe = höhe;
    }

    public double getHöhe() {
        return höhe;
    }

    public void setHöhe(double höhe) {
        this.höhe = höhe;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getVolumen() {
        return Math.PI * (radius * radius) * höhe;
    }
}
