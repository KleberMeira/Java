

public interface Lista {

	Object get(int pos);
	
	boolean add(int pos, Object item);
	
	boolean add(Object item);
	
	boolean remove(int pos);
	
	boolean isEmpty();
	
	int size();
	
}
