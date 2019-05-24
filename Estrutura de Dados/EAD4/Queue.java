
public interface Queue {

	// Insere objeto na fila
	boolean enqueue(Object value);
	// Remove e retorna o objeto no inicio da fila
	Object dequeue();
	// Apenas retorna o objeto no inicio da fila
	Object peek();
	// Verifica se a fila est Ì�a vazia
	boolean isEmpty();
	// Retorna o tamanho da fila
	int size();
	
}
