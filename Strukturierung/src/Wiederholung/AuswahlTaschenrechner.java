package Wiederholung;

public class AuswahlTaschenrechner {
    public static void main(String[] args) {
        double i = util.Input.readInt("Zahl1:");
        String o = util.Input.readString("Operator:");
        double a = util.Input.readInt("Zahl2:");
        switch (o) {
            case "+" -> System.out.println(i + a);
            case "-" -> System.out.println(i - a);
            case "/" -> System.out.println(i / a);
            case "*" -> System.out.println(i * a);
            default -> System.out.println("Ungültiger Operator");
        }
    }
}
