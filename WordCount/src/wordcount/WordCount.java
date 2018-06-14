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
public class WordCount {

    public static void main(String[] args) {
        String[] ListaNomeArquivos = PegaArquivos();
        int NumArquivos = ListaNomeArquivos.length;//pega numero e nomes dos arquivos
        
        Arquivo[] ListaArquivos = new Arquivo[NumArquivos];//instancia o vetor de arquivos
        
        for(int i = 0; i< NumArquivos; i++){
            ListaArquivos[i] = new Arquivo(ListaNomeArquivos[i]);//coloca o nome de arquivo i na casa i do vetor de arquivos
        }
        
        DizArquivos(ListaArquivos[0].tokens);
        
        //Arquivo[] listaA = new Arquivo[5];
        //listaA[0] = new Arquivo("teste.txt");
        //DizArquivos(listaA[0].tokens);
    }

    public static String[] PegaArquivos() {
        Scanner tecladoInt = new Scanner(System.in);
        
        System.out.println("Insira o número de arquivos");//Solicita o numero de arquivos ao usuario
        int numArquivos = tecladoInt.nextInt();
        String[] arquivos = new String[numArquivos];
        for(int i = 0; i < numArquivos; i++){
            //Scanner tecladoString = new Scanner(System.in);
            //System.out.println("Insira o nome do Arquivo numero: "+ i);//solicita o nome de cada arquivo
            //arquivos[i] = tecladoString.nextLine();
            arquivos[i] = VerificaArquivo(i);
        }
        
        return arquivos;
    }
    
    public static String VerificaArquivo(int i){
        System.out.println("Insira o nome do arquivo " + i);
        Scanner tecladoString = new Scanner(System.in);
        String nome;
        
            nome = tecladoString.nextLine();
            File f = new File (nome);
            if(f.exists()){
                
            }
            
            else{
                System.out.println("Arquivo invalido, tente novamente");
                nome = VerificaArquivo(i);
            }
        return nome;
    }
    
    public static void DizArquivos(String[] vetArquivos){//serve para testar o PegaArquivos
        for(int i = 0; i < vetArquivos.length; i++){
            System.out.println(vetArquivos[i]);
        }
    }

}
