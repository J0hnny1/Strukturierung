package u05_whileSchleife;

import util.Input;

public class W03_Anzahl6AusN {
    public static void main(String[] args) {
        int input = Input.readInt("Würfelanzahl:");
        int six = 0;
        for (int a = 0; a < input;a++){
            int random = util.Zufall.wuerfeln();
            System.out.println(random);

            if  ( random ==6){
                six ++;
            }
        }
        System.out.println("Sechser:" + six);
    }
}
