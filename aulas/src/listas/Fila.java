package listas;

public class Fila{
	private NoLista primeiro;
	private NoLista ultimo;
	private int quantidade;
	
	public Fila(){
		this.quantidade = 0;
	}

	public boolean estaVazia(){
		return this.quantidade == 0;
	}

	public NoLista getPrimeiro(){
		return this.primeiro;
	}
	private void setPrimeiro(NoLista primeiro){
		this.primeiro = primeiro;
	}
	public NoLista getUltimo(){
		return this.ultimo;
	}
	private void setUltimo(NoLista ultimo){
		this.ultimo = ultimo;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	private void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}

	public void enqueue(int valor){
		NoLista no = new NoLista(valor);
       
		if(!this.estaVazia()){
			this.ultimo.setNext(no);
			this.ultimo = no;
		}else{
			this.primeiro = no;
			this.ultimo = no;
		}
		this.quantidade++;
	}

	public void dequeue(){
		if(!this.estaVazia()){
			this.primeiro = this.primeiro.getNext();
		}
		this.quantidade--;
	}

	public void print(){
		NoLista current = this.primeiro;
       
		if(!this.estaVazia()){
			do{
				System.out.print(current.getValor() + " ");
				current = current.getNext();
			}while(current != null);
			System.out.println("");
		}
	}
}
