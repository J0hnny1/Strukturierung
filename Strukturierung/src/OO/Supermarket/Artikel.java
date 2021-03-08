package OO.Supermarket;

public class Artikel {
    //Attribute
    private String artikelNr;
    private String bezeichnung;
    private double Preis;
    private int bestand;

    public Artikel(int i, String hel, int preis, int bestand, int i1) {
    }

    //Methoden
    public String getArtikelNr() {
        return artikelNr;
    }

    public void setArtikelNr(String artikelNr) {
        this.artikelNr = artikelNr;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return Preis;
    }

    public void setPreis(double preis) {
        Preis = preis;
    }

    public int getBestand() {
        return bestand;
    }

    public void setBestand(int bestand) {
        this.bestand = bestand;
    }

    public Artikel(String artikelNr, String bezeichnung, double preis, int bestand) {
        this.artikelNr = artikelNr;
        this.bezeichnung = bezeichnung;
        Preis = preis;
        this.bestand = bestand;
    }
}
