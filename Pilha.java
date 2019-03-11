
public class Pilha{
    //criando atributos da Pilha
    private int tamanho[];
    private int quantidade;

    //metodo construtor
    public Pilha(){
        this.tamanho = new int[8];
        this.quantidade = -1;
    }
    
    //getters e setters
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
    	this.quantidade = quantidade;
    }
    
    //verificar se a pilha esta cheia ou vazia
    public boolean pilhaVazia(){
        return this.getQuantidade() == -1;
    }
    public boolean pilhaCheia(){
        return this.getQuantidade() == this.tamanho.length;
    }
    
    //metodo para adicionar um elemento no topo
    public void push(int valor){
        if(this.pilhaCheia()){
            System.out.println("Pilha cheia!");
        }else{
            this.quantidade++;
            this.tamanho[this.quantidade] = valor;
        }
    }
    
    //metodo para remover um elemento do topo
    public void pop(){
        if(this.pilhaVazia()){
            System.out.println("Pilha vazia!");
        }else{
            this.quantidade--;
        }
    }
    
    //metodo para alterar o elemento do topo
    public void pull(int valor){
        if(valor<1 || valor>this.getQuantidade()+1){
            System.out.println("Erro!");
        }else{
            int temp = this.tamanho[this.getQuantidade()];
            this.tamanho[this.getQuantidade()] = this.tamanho[valor-1];
            this.tamanho[valor-1] = temp;
        }
    }
    
    //metodo para buscar o elemento no topo da pilha
    public void top(){
        if(this.pilhaVazia()){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("O elemento do topo é: " + this.tamanho[this.getQuantidade()]);
        }
    }
    
    //metodo para exibir os elementos da pilha
    public void exibirPilha(){
        if(this.pilhaVazia()){
            System.out.println("Pilha vazia!");
        }else{
            System.out.println("Quantidade de elementos: " + (this.getQuantidade()+1));
            for(int i=0; i<=this.getQuantidade(); i++){
                System.out.println(this.tamanho[i]);
            }
        }
    }                
}