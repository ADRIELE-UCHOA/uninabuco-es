
public class FilaTeste
{
	//metodo main
    public static void main(String args []){
    	Fila fila1 = new Fila();
       	fila1.queue(7);
 	   	fila1.queue(8);
        fila1.queue(18);
    	fila1.dequeue();
   	    fila1.queue(26);
   	    fila1.dequeue();
   	    fila1.queue(42);		
        fila1.exibirFila();
    	}
    	    	   

}