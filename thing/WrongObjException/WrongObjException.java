/*  
** Erstellt am 28.01.2005
*/
 
package WrongObjException;

/** @author Christian Kramer
 *** Matrikelnummer 24226284 
 **/

public class WrongObjException extends Exception
{
    public WrongObjException(){
        System.err.println("Unbekannter Objekttyp ( Namenszeile )");
    }
}