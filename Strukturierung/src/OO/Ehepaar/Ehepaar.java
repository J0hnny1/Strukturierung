package OO.Ehepaar;

public class Ehepaar {
    private Person ehemann;
    private Person ehefrau;
    private Datum hochtzeitstag;

    public Ehepaar(Person ehemann, Person ehefrau, Datum hochtzeitstag) {
        this.ehemann = ehemann;
        this.ehefrau = ehefrau;
        this.hochtzeitstag = hochtzeitstag;
    }

    public Person getEhemann() {
        return ehemann;
    }

    public Person getEhefrau() {
        return ehefrau;
    }

    public Datum getHochtzeitstag() {
        return hochtzeitstag;
    }
}
