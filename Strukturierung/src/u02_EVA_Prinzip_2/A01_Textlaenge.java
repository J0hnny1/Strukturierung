/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u02_EVA_Prinzip_2;

import util.Input;

/**
 *
 * @author ZimmerJonathan
 */
public class A01_Textlaenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String text = Input.readString ("Text Eingeben:");
        int laenge = text.length() ;
        
        System.out.println( "Der Text besteht aus: " + laenge +  " Zeichen" );


        
        
    }
    
}
