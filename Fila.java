
public class Fila {
	//criando atributos da Fila
	private int tamanho[];
	private int primeiro;
	private int ultimo;
	private int quantidade;
	//construtor
	public Fila () {
		this.tamanho = new int[7];
		this.primeiro = 0;
		this.ultimo = 0;
		this.quantidade = 0; 
	}
	//getters e setters
	public int[] getTamanho() {
		return tamanho;
	}
	public void setTamanho(int[] tamanho) {
		this.tamanho = tamanho;
	}
	public int getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}
	public int getUltimo() {
		return ultimo;
	}
	public void setUltimo(int último) {
		this.ultimo = último;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	//metodos para verificar se a fila esta cheia ou vazia
	public boolean filaVazia() {
		return this.getQuantidade() == 0;
	}
	public boolean filaCheia() {
		return this.getQuantidade() == this.tamanho.length;
	}
	public void queue(int valor){
		if(this.filaCheia()){
			System.out.println("Fila cheia!");
		}else{
			this.tamanho[this.ultimo] = valor;
			this.ultimo++; this.quantidade++;
		}
	}
	public void dequeue(){
		if(this.filaVazia()){
			System.out.println("Fila vazia");
		}else{
			this.ultimo--; this.quantidade--;
			for(int i=0, p=1; i<this.getQuantidade(); i++, p++){
				this.tamanho[i] = this.tamanho[p];
			}
		}
	}
	
	public void exibirFila(){
		if(this.filaVazia()){
			System.out.println("Fila vazia");
		}else{
			for(int i=0; i<this.getQuantidade(); i++){
				System.out.println(this.tamanho[i]);
			}
		}
	}
}