public class Programa {

	public static void main(String[] args) {
		Fila f = new Fila();
		
		f.enqueue(51);
		f.enqueue(88);
		f.dequeue();
		f.enqueue(19);
		f.enqueue(26);
		f.dequeue();
		f.enqueue(30);
		f.print();
	}

}
