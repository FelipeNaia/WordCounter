package wordcount;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.NoSuchElementException;


/**
 *
 * @author 201719070296
 */
public class Processador {
    Scanner input;    
    
    
    public Scanner abreArquivo(){
        
        try{
            input = new Scanner( new File( "teste.txt"));
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }
        
        return input;
    }
}
