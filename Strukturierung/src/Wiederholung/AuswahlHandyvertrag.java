package Wiederholung;

public class AuswahlHandyvertrag {
    public static void main(String[] args) {
        int in = util.Input.readInt("Gesprächsminuten: ");
        if (in > 30) {
            double over = (in - 30) * 0.248 + 22.98;
            System.out.println("Rechnungsbetrag:"  + over + "€");
        } else System.out.println("Rechnungsbetrag: 22,98€");
    }
}
