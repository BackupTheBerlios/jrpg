package script;

import java.io.*;
import WrongObjException.WrongObjException;
/*  
 ** Erstellt am 28.01.2005
 */

/** @author Christian Kramer
 **
 **/

public class scriptread 
{
    public void read(File path) 
    {
        int i = 0;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try
        {
            RandomAccessFile countRow = new RandomAccessFile(path, "r");
        
            for (String inhalt ; (inhalt = countRow.readLine()) != null; )
            { 
              if ( inhalt.length() == 0  )
              { i--; }
                i++;
            }
            
            String zeile[] = new String[i];
            //=== Variablen der nächsten Schleife
            RandomAccessFile readout = new RandomAccessFile(path, "r");
            int j = 0;
            String zeilen;
            //===================================
            
            while ((zeilen = readout.readLine()) != null)
            {
                if ( zeilen.length() != 0)
                {
                zeile[j] = zeilen;
                j++;
                }
            }
            read_name(zeile[0]); 
        }
        catch ( FileNotFoundException e )
        {
            System.err.print("Datei nicht gefunden");
        }
        catch ( IOException e )
        {
            System.err.print("Allgemeiner Ein/Ausgangsfehler");
        } 
        catch (WrongObjException e) { }
    }

    private static void read_name(String name) throws WrongObjException
    {
        if ( name.startsWith("OBJECT_INVENTORY_WEAPON") )
        {
           /**
            **MethodenAufruf für die Methode die die Waffen erstellt.
            */
            System.out.print("Inventory");
        } 
        else if ( name.startsWith("OBJECT_MAP_BUILDING") )
        {
            /**
             **MethodenAufruf für die Methode die die Map erstellt.
             */
            System.out.print("Map");
        } 
        
        /**
         * Platz für die restlichen Methoden.
         */
        else
        {
            throw new WrongObjException();
        }
    }
}

