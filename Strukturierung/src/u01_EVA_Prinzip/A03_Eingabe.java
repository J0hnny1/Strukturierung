/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u01_EVA_Prinzip;

//import util.Input;


public class A03_Eingabe {


    public static void main(String[] args) {
       int alter = util.Input.readInt("Wie alt sind sie?");
        int geburtsjahr = 2020 -alter;
       System.out.println ("Sie sind im Jahr " + geburtsjahr + " gebohren");
    }
    
}
