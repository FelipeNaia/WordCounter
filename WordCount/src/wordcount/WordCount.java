package wordcount;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.Formatter;
import java.util.NoSuchElementException;


/**
 *
 * @author 201719070296
 */
public class WordCount {

    public static void main(String[] args) {
        //String[] arquivos = PegaArquivos();
        //int numArquivos = arquivos.length;
        //DizArquivos(arquivos);
        
        Processador p = new Processador();
        p.abreArquivo();
        System.out.println(p.abreArquivo().nextLine());
        String[] tokens = p.abreArquivo().nextLine().split( " " );
        DizArquivos(tokens);
    }

    public static String[] PegaArquivos() {
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.println("Insira o número de arquivos");//Solicita o numero de arquivos ao usuario
        int numArquivos = tecladoInt.nextInt();
        String[] arquivos = new String[numArquivos];
        
        for(int i = 0; i < numArquivos; i++){
            Scanner tecladoString = new Scanner(System.in);
            System.out.println("Insira o nome do Arquivo numero: "+ i);//solicita o nome de cada arquivo
            arquivos[i] = tecladoString.nextLine();
            
        }
        
        return arquivos;
    }
    
    public static void DizArquivos(String[] vetArquivos){//serve para testar o PegaArquivos
        for(int i = 0; i < vetArquivos.length; i++){
            System.out.println(vetArquivos[i]);
        }
    }

}
