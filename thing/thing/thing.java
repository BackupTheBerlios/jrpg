package thing;

import java.io.*;

import WrongObjException.WrongObjException;
import script.*;

/*  
 ** Erstellt am 24.01.2005
 */

/** @author Christian Kramer
 *** Matrikelnummer 24226284 
 **/
public class thing {

    public static void main(String[] args) throws WrongObjException{
        //File neu = new File("C:/jrpg/inv.txt");
        File auf = new File("C:/jrpg/in.txt");
            scriptread neu = new scriptread();

            neu.read(auf);
          
    }
}

