package M01_Methoden;

public class M01_Potenzen {
    public static void main(String[] args)
    {

        double x = util.Input.readInt("X:");
        int y = util.Input.readInt("N:");
        double result = potenz(x,y);
        System.out.print("Result: " + result );
    }

    public static double potenz(double x, int n)
    {
        double result = Math.pow(x,n);
        return result;

    }
}
