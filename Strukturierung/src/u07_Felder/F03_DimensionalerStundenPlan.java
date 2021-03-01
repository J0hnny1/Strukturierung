package u07_Felder;

public class F03_DimensionalerStundenPlan {
    public static void main(String[] args) {
        String[][] y = new String[5][7];

        y[0][0] = "Mo";
        y[1][0] = "Di";
        y[2][0] = "Mi";
        y[3][0] = "Do";
        y[4][0] = "Fr";

        y[0][1] = "M";
        y[0][2] = "M";
        y[0][3] = "E";
        y[0][4] = "E";
        y[0][5] = "Ph";
        y[0][6] = "";

        y[1][1] = "If";
        y[1][2] = "Sp";
        y[1][3] = "D";
        y[1][4] = "D";
        y[1][5] = "F";
        y[1][6] = "F";

        y[2][1] = "M";
        y[2][2] = "M";
        y[2][3] = "Sp";
        y[2][4] = "Sp";
        y[2][5] = "K";
        y[2][6] = "";

        y[3][1] = "E";
        y[3][2] = "E";
        y[3][3] = "M";
        y[3][4] = "F";
        y[3][5] = "If";
        y[3][6] = "If";

        y[4][1] = "Ph";
        y[4][2] = "Ph";
        y[4][3] = "E";
        y[4][4] = "E";
        y[4][5] = "K";
        y[4][6] = "K";


        //Alle ausgeben
        for (int i = 0; i < 7; i++) {
            if (i == 1) System.out.println("------------------");
            for (int j = 0; j < 5; j++) {
                System.out.print(y[j][i] + "\t");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();

        //Montag ausgeben
        for (int i = 0; i < 7; i++) {
            if (i == 1) System.out.println("--");
            System.out.println(y[0][i] + "\t");
        }

        System.out.println();
        System.out.println();
        System.out.println();

        //Erste Stunde ausgeben
        for (int i = 0; i < 2; i++) {
            if (i == 1) System.out.println("------------------");
            for (int j = 0; j < 5; j++) {
                System.out.print(y[j][i] + "\t");
            }
            System.out.println();
        }


    }
}

