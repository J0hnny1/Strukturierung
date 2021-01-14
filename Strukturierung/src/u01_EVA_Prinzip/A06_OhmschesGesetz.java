/*
* @author ZimmerJonathan
*/

package u01_EVA_Prinzip;


import util.Input;

public class A06_OhmschesGesetz {

  
    public static void main(String[] args) {
        
        int zahl1, zahl2, ergebniss ;
        
        System.out.println("Spannung berechnen:");
        
        zahl1 = Input.readInt("Wiederstand (R):") ;
        zahl2 = Input.readInt("Stromstärke (I):") ;
        
        ergebniss = zahl1 * zahl2 ;
                
        //System.out.println("Spannung (U):" = + ergebniss);
        
    }
    
}
