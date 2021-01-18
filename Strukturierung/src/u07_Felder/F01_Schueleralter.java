package u07_Felder;



public class F01_Schueleralter {
    public static void main(String[] args) {
        int[] alter = {16, 17, 17, 16, 18};
        //System.out.println("Der Schüler mit der Nummer 4 ist " + alter[3] + " Jahre alt ");

       // System.out.println( "Der Schüler ist "+ alter[util.Input.readInt("Posotion des Schülers?")] + " Jahre alt");

        for (int i = 0; i <=4; i++)
        {
            System.out.println("Der Schüler mit der Nummer " + (i +1)  + " ist " + alter[i] + " Jahre alt.");
        }


    }
}
