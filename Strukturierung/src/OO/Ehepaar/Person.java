package OO.Ehepaar;

public class Person {
    private String nachname;
    private String vorname;
    private String geschlecht;
    private Datum geburtsdatum;

    public Person(String nachname, String vorname, String geschlecht, Datum geburtsdatum) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.geschlecht = geschlecht;
        this.geburtsdatum = geburtsdatum;
    }

    public Datum getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getNachname() {
        return nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

}
