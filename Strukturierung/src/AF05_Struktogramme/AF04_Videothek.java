package AF05_Struktogramme;

import util.Input;

public class AF04_Videothek {
    public static void main(String[] args) {
        int fsk = Input.readInt("FSK Freigabe:");
        int alter = Input.readInt("Alter des Kundens:");

        if (alter >= fsk){
            System.out.println("Der Kunde ist alt genug.");
        }

        else {
            System.out.println("Der Kunde ist NICHT alt genug.");
        }

    }
}
