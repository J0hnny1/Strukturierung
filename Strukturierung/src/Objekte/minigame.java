package Objekte;

import java.util.Random;

public class minigame {
    public static void main(String[] args) {
        String replay;
        do {
            //"random" class für zufallszahlen
            Random random = new Random();
            //gegner erzeugen
            enemy enemy2 = new enemy(random.nextInt(10) + 1, random.nextInt(10) + 1);
            enemy enemy1 = new enemy(random.nextInt(10) + 1, random.nextInt(10) + 1);
            //Spieler erzeugen
            witcher witcher1 = new witcher(20, random.nextInt(10) + 3);

            //Anfangsausgabe mit stats
            System.out.println("Dein Witcher hat " + witcher1.hp + "hp, " +
                     witcher1.damage + " attack points");


            System.out.println("Du wirst angegriffen!");
            //Schadensverechnung
            witcher1.hp = witcher1.hp - enemy1.damage;
            enemy1.hp = enemy1.hp - witcher1.damage;
            if (witcher1.hp > 0) {
                System.out.println("Du hast noch " + witcher1.hp + " hp, und den gegner besiegt!");
            } else {
                System.out.println("Du bist tot!");
                java.lang.System.exit(0);
            }

            int choice = util.Input.readInt("Willst du dich (1) Ausruhen,(2) Trainieren(3) fortfahren");
            switch (choice) {
                case 1 : witcher1.ausruhen(); System.out.println("Ich habe jetzt " + witcher1.hp + "hp");
                break;
                case 2 : witcher1.trainieren(); System.out.println("Ich mache jetzt " + witcher1.damage + "damage");

            }
            System.out.println("Du wirst angegriffen von Gegner mit " + enemy2.hp + "health");
            enemy2.hp = enemy1.hp - witcher1.damage;
            witcher1.hp = witcher1.hp - enemy2.damage;
            if (witcher1.hp > 0 && enemy2.hp <= 0) {
                System.out.println("Du hast noch " + witcher1.hp + " hp, und den gegner besiegt!");
            } else {
                System.out.println("Du bist tot!");
                java.lang.System.exit(0);
            }
            replay = util.Input.readString("Willst du nochmal spielen? yes,no");
        } while (replay.equals("yes"));


    }
}
