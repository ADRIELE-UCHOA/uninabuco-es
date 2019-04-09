public class Programa {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		p.push(15);
		p.push(33);
		p.push(50);
		p.push(44);
		p.top();
		p.pop();
		p.pull(18);
		p.print();
		p.top();
	}

}
