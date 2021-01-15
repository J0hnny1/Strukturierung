package u06_modulo;

public class M06_SekundenUmrechnung {
    public static void main(String[] args) {
        int i = util.Input.readInt("Umzurechnende Sekunden: ");
        System.out.println(i / 60 + " Minuten");
        System.out.println(i * 0.000278 + " Stunden");
        System.out.println(i * 0.0000116 + " Tage");
    }
}
