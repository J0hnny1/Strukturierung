/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u01_EVA_Prinzip;

import util.Input;


public class A04_Summe {


    public static void main(String[] args) {
        int zahl1 ;
        int zahl2 ;
        int ergebniss ;
        zahl1 = Input.readInt("Summand 1") ;
        zahl2 = Input.readInt("Summand 2") ;



        ergebniss = zahl1 + zahl2 ;

        System.out.println("Summe: " + ergebniss);

        
        
    }
    
}
