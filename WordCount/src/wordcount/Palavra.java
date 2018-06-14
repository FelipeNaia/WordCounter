package wordcount;

/**
 *
 * @author Felipe
 */
public class Palavra {
    String nome;
    Palavra proxima;
    Palavra anterior;
    private final int contagem[];
    
    Palavra(String nom, int NumArquivos, int indice){
        this.nome = nom;
        this.contagem = new int[NumArquivos];
        for(int i = 0; i < this.contagem.length; i++){
            this.contagem[i] = 0;//Preenche todos os espaços do vetor com 0
        }
        this.contagem[indice] = 1;        
    }
    
    public void Repetir(int indice){
        this.contagem[indice]++;
    }
    
    
    
    
}
