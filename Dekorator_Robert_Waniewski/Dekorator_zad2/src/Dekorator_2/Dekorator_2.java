
package Dekorator_2;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Robert Waniewski
 */
public class Dekorator_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            DataInputStream strumień = new DataInputStream(new FileInputStream("tekst.txt"));
           
            int c;
            int liczba_slow = 0;
            while ((c = strumień.read()) != -1) {
            if ( (char)c=='\n' || (char)c==' ' || c==11  || c==9){
            liczba_slow++;
            }
                        
            }
            strumień = new DataInputStream(new FileInputStream("tekst.txt"));
            if ((c=strumień.read()) != -1) liczba_slow++;  
            
            System.out.println(liczba_slow);
            strumień.close(); 
        } catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch(IOException e){
            System.out.println("Error In/Out");
        }
    }
    
}
