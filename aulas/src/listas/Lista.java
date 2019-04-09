package listas;

public class Lista {
	//atributos
	private NoLista cabeca;
	private NoLista cauda;
	private int quantidade;

	public Lista(){
		this.cabeca = null;
		this.cauda = null;
		this.quantidade = 0;
	}

	public boolean estaVazia() {
		return this.cauda == null;
	}
	
	public NoLista getCabeca(){
		return this.cabeca;
	}
	private void setCabeca(NoLista cabeca){
		this.cabeca = cabeca;
	}
	public NoLista getCauda(){
		return this.cauda;
	}
	private void setCauda(NoLista cauda){
		this.cauda = cauda;
	}
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public void adicionar(int valor){
		NoLista no = new NoLista(valor);

        if (!this.estaVazia()) {
            this.cauda.setNext(no);
            this.cauda = no;
        }else {
            this.cabeca = no;
            this.cauda = no;
        }
        this.quantidade++;
    }
	
    public void adicionarPosicao(int valor, int posicao){
        NoLista current = this.cabeca;
        NoLista no = new NoLista(valor);
	    
        if(!this.estaVazia() && posicao>0 && posicao<=this.getQuantidade()){
            if(posicao == 1){
                this.setCabeca(no);
                no.setNext(current);
            }else if(posicao == this.getQuantidade()){
                for(; current.getNext() != this.cauda;){
                    current = current.getNext();
                }
                no.setNext(current.getNext());
                current.setNext(no);
            }else{
                for(int i=1; i<=posicao; i++){
                    if(posicao-1 == i){
                        no.setNext(current.getNext());
                        current.setNext(no);
                    }else{
                        current = current.getNext();
                    }
                }
            }
            this.quantidade++;
        }
    }

    public void remove(int valor){
        NoLista current = this.cabeca;

        if(!this.estaVazia()){
            do{
                if(current.getValor() == valor){
                    break;
                }else{
                    current = current.getNext();
                }
            }while(current != null);

            if(current != null){
                if(current == this.cauda && current == this.cabeca){
                    this.cabeca = this.cauda = null;
                }else if(current == this.cabeca){
                    this.cabeca = this.cabeca.getNext();
                }else if(current == this.cauda){
                    current = this.cabeca;
                    for(; current.getNext() != this.cauda;){
                        current = current.getNext();
                    }
                    current.setNext(null);
                    this.setCauda(current);
                }else{
                    NoLista temp = this.cabeca;

                    for(; temp.getNext() != current;){
                        temp = temp.getNext();
                    }
                    temp.setNext(current.getNext());
                }
                this.quantidade--;
            }
        }
    }

    public void removePosicao(int posicao){
        NoLista current = this.cabeca;

        if(!this.estaVazia() && posicao>0 && posicao<=this.getQuantidade()){
            if(posicao == 1){
                this.cabeca = current.getNext();
                current.setNext(null);
            }else if(posicao == this.getQuantidade()){
                for(; current.getNext() != this.cauda;){
                    current = current.getNext();
                }
                this.cauda = current;
                current.setNext(null);
            }else{
                for(int i=1; i<=posicao; i++){
                    if(posicao-1 == i){
                        current.setNext(current.getNext().getNext());
                    }else{
                        current = current.getNext();
                    }
                }
            }
            this.quantidade--;
        }
    }

    public void removeAll(int valor){
        NoLista current = this.cabeca;
        int temp = this.getQuantidade();

        if(!this.estaVazia()){
            for(int i=1; i<=temp; i++){
                if(current.getValor() == valor){
                    this.remove(valor);
                }else{
                    current = current.getNext();
                }
            }
        }
    }

    public void print(){
        NoLista current = this.cabeca;
	    
        if(!this.estaVazia()){
            do{
                System.out.print(current.getValor() + " ");
                current = current.getNext();
            }while(current != null);
            System.out.println("");
        }
    }
	
}
