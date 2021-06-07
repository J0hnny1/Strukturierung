package SchiefeEbene;

public class Kraefte {
    private String name;
    private Vektor vec;

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

    public Kraefte(String name) {
        this.name = name;
    }
}