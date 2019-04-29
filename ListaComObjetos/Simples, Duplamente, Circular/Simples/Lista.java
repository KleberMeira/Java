
public interface Lista {

	boolean insert(Object obj);
	Object remove();
	boolean insertLast(Object obj);
	Object removeLast();
	boolean insert(int pos, Object obj);
	Object remove(int pos);
	Object peek(int pos);
	void sort();
	void invert();
	int size();
	Lista getFirstHalf();
	Lista getSecondHalf();
	boolean isEmpty();
	boolean contains(Object obj);
	String toString();
	
}
