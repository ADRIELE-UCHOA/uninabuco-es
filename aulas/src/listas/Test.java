package listas;

public class Test {

	public static void main(String[] args) {
	
		Lista lista = new Lista();
		
		System.out.println("Está vazia? " + lista.estaVazia());
		lista.adicionar(55);
		System.out.println("Está vazia? " + lista.estaVazia());
		lista.adicionar(55);
		lista.adicionar(98);
		lista.adicionar(12);
		lista.adicionar(55);
		lista.adicionar(17);
		lista.adicionar(18);
		lista.print();
		lista.remove(12);
		lista.adicionarPosicao(15, 1);
		lista.removePosicao(2);
		lista.removeAll(55);
		lista.print();
	}

}
