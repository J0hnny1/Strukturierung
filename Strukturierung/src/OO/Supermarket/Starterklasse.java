package OO.Supermarket;

public class Starterklasse {
    public static void main(String[] args) {
        Artikel seife = new Artikel(3,"Hel",69,420,0);
        seife.setBestand(100);
        System.out.println(seife.getBestand());
    }
}
