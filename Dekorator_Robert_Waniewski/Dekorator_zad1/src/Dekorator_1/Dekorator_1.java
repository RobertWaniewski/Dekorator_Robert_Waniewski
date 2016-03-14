
package Dekorator_1;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author Robert Waniewski
 */
public class Dekorator_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            DataInputStream strumień = new DataInputStream(new FileInputStream("tekst.txt"));
           
            int c;
            int liczba_wierszy = 0;
            while ((c = strumień.read()) != -1) {

            if ( (char)c=='\n'){
            liczba_wierszy++;
            }
            }
            System.out.println(liczba_wierszy);
            strumień.close();   
        } catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        } catch(IOException e){
            System.out.println("Błąd wejścia-wyjścia");
        }
    }
    
}
