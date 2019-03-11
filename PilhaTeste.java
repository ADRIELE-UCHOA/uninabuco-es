
public class PilhaTeste{ 
    //metodo main
    public static void main(String args[]){
        //instanciando um objeto tipo Pilha
        Pilha p1 = new Pilha();
        p1.exibirPilha();
        p1.push(6);
        p1.push(5);
        p1.push(4);
        p1.push(3);
        p1.push(2);
        p1.exibirPilha();
        p1.top();
        p1.pop();
        p1.pop();
        p1.exibirPilha();
        p1.top();
        p1.push(1);
        p1.pull(3);
        p1.exibirPilha();
        p1.top();
    }
}
