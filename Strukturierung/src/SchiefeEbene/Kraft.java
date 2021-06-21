package SchiefeEbene;

public class Kraft {
    private String name;
    private Vektor vec;

    public Kraft(String mog, Vektor v) {
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Vektor getVec() {
        return vec;
    }
    public void setVec(Vektor vec) {
        this.vec = vec;
    }

    public Kraft(String name) {
        this.name = name;
    }

    public Kraft(Vektor vec) {
        this.vec = vec;
    }
}