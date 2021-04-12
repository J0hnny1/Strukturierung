package OO.Ehepaar;

public class Starterklasse {
    public static void main(String[] args) {
        Person vollmer = new Person("kek","manuel","Männlich",new Datum(1,2,4));
        Person manuel = new Person("kek","manuel","Männlich",new Datum(13,10,2001));
        Ehepaar kek = new Ehepaar(vollmer,manuel,new Datum(12,4,2021));

        System.out.println(kek.getEhefrau().getGeburtsdatum().getDatum());

        System.out.println(kek.getEhemann().getGeschlecht());
    }
}
