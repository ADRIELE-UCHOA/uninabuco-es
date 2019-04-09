package listas;

public class Pilha{

	private NoLista topo;
	private NoLista base;
	private int quantidade;
	
	public Pilha(){
		this.quantidade = 0;
	}
    
	public boolean estaVazia(){
		return this.topo == null;
	}
    
	public NoLista getTopo(){
		return this.topo;
	}
	private void setTopo(NoLista topo){
		this.topo = topo;
	}
	public NoLista getBase(){
		return this.base;
	}
	private void setBase(NoLista base){
		this.base = base;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	private void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}
    
	public void push(int valor){
		NoLista no = new NoLista(valor);
        
		if(!this.estaVazia()){
			this.topo.setNext(no);
			this.topo = no;
		}else{
			this.topo = no;
			this.base = no;
		}
		this.quantidade++;
	}
    
	public void pop(){
		NoLista current = this.base;
        
		if(!this.estaVazia()){
			if(this.base != this.topo){
				do{
					current = current.getNext();
				}while(current.getNext() != this.getTopo());
				current.setNext(null);
				this.setTopo(current);
			}else{
				this.base = null;
				this.topo = null;
			}
		}
		this.quantidade--;
	}
	
	public void top(){
		if(!this.estaVazia()){
			System.out.println("Topo = " + this.getTopo().getValor());
		}
	}
    
	public void pull(int valor){
		if(!this.estaVazia()){
			this.topo.setValor(valor);
		}
	}
    
	public void print(){
		NoLista current = this.base;
        
		if(!this.estaVazia()){
			do{
				System.out.print(current.getValor() + " ");
				current = current.getNext();
			}while(current != null);
		}
		System.out.println("");
	}
}
