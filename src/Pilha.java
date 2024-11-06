public class Pilha {
    Object[] pilha;
    int posicao_pilha;
     
    public Pilha(int Tamanho){
        this.posicao_pilha = -1;
        this.pilha = new Object[Tamanho];
    }
    public boolean pilhaVazia(){
        //return this.posicao_pilha == -1;
        return this.posicao_pilha ==-1;
    }
    public int Tamanho_atual(){
        if(pilhaVazia()){
            return 0;
        }else{
            return this.posicao_pilha + 1;
        }
    }
    public void Empilhar(Object Empilhar){
        if (this.posicao_pilha >= this.pilha.length) {
            System.out.println("Pilha Cheia!");
}else{
    this.pilha[++this.posicao_pilha] = Empilhar; 
}
    }
    public void Imprimir_pilha(){
        if(pilhaVazia()){
            System.out.println("Pilha Vazia!");
        } else{
            for (int p=this.posicao_pilha; p >= 0; p--){
            System.out.println(this.pilha[p]);
            }
        }
    }
}