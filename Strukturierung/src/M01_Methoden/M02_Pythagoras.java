package M01_Methoden;

public class M02_Pythagoras {
    public static void main(String[] args)
    {
        double c = hypothenuse(util.Input.readDouble("a:"), util.Input.readDouble("b: "));

        System.out.println("Dieagonale der Fläche a-b: " + c);

    }

public static double hypothenuse(double a, double b)
    {
        double powa = Math.pow(a, 2);
        double powb = Math.pow(b, 2);
        double pow = powa + powb;

        return Math.sqrt(pow);
    }


}
