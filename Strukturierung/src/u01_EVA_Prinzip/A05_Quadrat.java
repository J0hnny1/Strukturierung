/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u01_EVA_Prinzip;

import util.Input;

/**
 *
 * @author ZimmerJonathan
 */
public class A05_Quadrat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int zahl1 ;
        
        int ergebniss ;
        zahl1 = Input.readInt("Zahl1") ;
        
        
        ergebniss = zahl1 * zahl1 ;
                
        System.out.println(ergebniss);
    }
    
}
