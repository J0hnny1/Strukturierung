/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u02_EVA_Prinzip_2;

import util.Input;

/**
 * @author ZimmerJonathan
 */
public class A02_VornameNachname {



    public static void main(String[] args) {

        String vorname = Input.readString("Vorname: "  );
        String nachname = Input.readString("Nachname: "  );


        int vornamelaenge = vorname.length();

        System.out.println("Der Vorname " + vorname + " besteht aus " + vornamelaenge + " Zeichen.");

        int nachnamelaenge = nachname.length();

        System.out.println("Der Nachname " + nachname + " besteht aus " + nachnamelaenge + " Zeichen.");

        int komplett = vornamelaenge + nachnamelaenge;
      int bytes = (vorname+nachname).getBytes().length;
        System.out.println("Der Komplette Name besteht aus " + komplett + " Zeichen.");


        System.out.println("Der Name besteht aus " + bytes +  " bytes");

//String vorname2 = vorname.length()
//int kp = util.Eingabe.readByte;

//System.out.println(kp);

    }
    
}
