package u11_Debugging;

public class parabel {
    public static void main(String[] args) {
        double[] wert = new double[10];
        for (int i = 0; i <= wert.length; i++) {
            wert[i] = Parabel(i + 1, 3);
            System.out.println(wert[i]);
        }

    }

    public static double Parabel(double n, int x) {
        double y = x * x + x + n;
        return y;

    }
}

