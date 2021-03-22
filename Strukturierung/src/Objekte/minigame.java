package Objekte;

import java.util.Random;
import java.util.Scanner;

public class minigame {
    public static void main(String[] args) throws InterruptedException {
        String replay;
        do {

            //"random" class für zufallszahlen
            Random random = new Random();

            //gegner erzeugen
            enemy enemy2 = new enemy(random.nextInt(10) + 1, random.nextInt(10) + 1);
            enemy enemy1 = new enemy(random.nextInt(10) + 1, random.nextInt(10) + 1);

            //Spieler erzeugen
            witcher witcher1 = new witcher(10, random.nextInt(10) + 3);

            //Anfangsausgabe mit stats
            System.out.println("Dein Witcher hat " + witcher1.hp + "hp, " +
                    witcher1.damage + " attack points");


            System.out.println("Du wirst angegriffen!");
            //Schaden verechnung

            if (random.nextInt(6) % 2 == 0) {
                witcher1.hp = witcher1.hp - enemy1.damage;
            } else {
                enemy1.hp = enemy1.hp - witcher1.damage;
            }

            Thread.sleep(1000);
            if (witcher1.hp > 0) {
                System.out.println("Du hast noch " + witcher1.hp + " hp, und den gegner besiegt!");
                if (random.nextInt() % 3 == 0) {
                    System.out.println("Du hast eine health potion bekommen + 4 health");
                    witcher1.hp = witcher1.hp + 4;
                }
            } else {
                System.out.println("Du bist tot!");
                java.lang.System.exit(0);
            }
            Scanner ch = new Scanner(System.in);
            System.out.println("Willst du dich (1) Ausruhen,(2) Trainieren(3) fortfahren");
            int choice = ch.nextInt();
            //util.Input.readInt("Willst du dich (1) Ausruhen,(2) Trainieren(3) fortfahren");
            switch (choice) {
                case 1 -> {
                    witcher1.ausruhen();
                    System.out.println("Ich habe jetzt " + witcher1.hp + "hp");
                }
                case 2 -> witcher1.trainieren(); //System.out.println("Ich mache jetzt " + witcher1.damage + "damage");
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
            Scanner re = new Scanner(System.in);
            System.out.println("Willst du nochmal spielen? yes,no");
            replay = re.nextLine();
            //replay = util.Input.readString("Willst du nochmal spielen? yes,no");
        } while (replay.matches("[yY].*"));


    }
}
