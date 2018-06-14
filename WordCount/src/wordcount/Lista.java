package wordcount;

/**
 * @author Felipe
 */
public class Lista {
    int NumArquivos, indice;
    Palavra cabeca = new Palavra("", NumArquivos, 0);
    
    Lista(){
       
    }
    
    
    public void InserePalavra(String nome, int NumArquivos, int indice){
        Palavra nova = new Palavra(nome, NumArquivos, indice);
        if(this.IsVazia()){
            this.cabeca = nova;
        }
        else{
            Palavra Maior = BuscaMaior(nome);
        }
        
    }
    
    public Palavra BuscaMaior(String nome){
        Palavra percorre = cabeca;
        if(this.IsVazia()){
            System.out.println("Método BuscaMaior sendo chamado incorretamente");
            
        }
        else{
            if()
        }
    }
    
    public boolean IsVazia(){//verifica se a lista está vazia, se estiver, retorna true
        boolean resultado = true;
        if(this.cabeca != null){
            resultado = false;
        }
        return resultado;
    }
    
    
}
