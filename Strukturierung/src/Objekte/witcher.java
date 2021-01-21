package Objekte;

import java.util.Random;

class witcher {
     //Initialisierung der Attribute
    //int mana;
    double hp;
    double damage;
    //"random" class für zufallszahlen
     Random random = new Random();

    //Konstruktor
     witcher(double h, double d){
         //mana = m;
         hp = h;
         damage = d;
     }
    //Methoden
     void ausruhen(){
         System.out.println("Ich bin am entspannen");
         //mana ++;
         hp = hp + random.nextDouble() * 5;
     }

     void trainieren() {
         damage = damage + random.nextDouble() * 5;
         System.out.println("Jetzt mache ich " + damage + " schaden!");
     }
   /*
       void fortfahren() {
        enemy enemy2 = new enemy(random.nextInt(10) +1,random.nextInt(10)+1);
       }
       */

}

