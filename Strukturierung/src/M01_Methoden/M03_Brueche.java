package M01_Methoden;

public class M03_Brueche {
    public static void main(String[] args)
    {
        System.out.println(ggt(util.Input.readInt("Zähler: "), util.Input.readInt("Nenner: ")));
    }

    public static int ggt(int z, int n) {
        if (n == 0)
            return z;
        else
            return ggt(n, z % n);

    }
}