package wordcount;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.NoSuchElementException;

/**
 *
 * @author Felipe
 */
public class Arquivo {
    String nome;
    String texto;
    String[] tokens;
    
    
    public Arquivo(String nomeArquivo){
        Scanner input;
        
        try{
            input = new Scanner( new File( nomeArquivo ));
            this.nome = nomeArquivo;
            this.texto = input.nextLine();
            this.tokens = this.texto.split( " " );
            
            
        }
        catch(FileNotFoundException fileNotFoundException){
            System.err.println("Erro ao abrir arquivo");
            System.exit(1);
        }
        
        
    }
    
    
    
    
    
}
