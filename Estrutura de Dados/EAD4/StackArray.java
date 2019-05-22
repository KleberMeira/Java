
public class StackArray implements Stack {

	private Object[] vetor;
	private int pos;
	

	public StackArray() {
		this.vetor = new Object[6];
		this.pos = -1;
	}

	// --------------------------->
	public Object[] getVetor() {
		return vetor;
	}

	public void setVetor(Object[] vetor) {
		this.vetor = vetor;
	}
	// <----------------------------

	@Override
	public boolean push(Object value) {
		
		if(pos < this.vetor.length) {
			this.vetor[++pos] = value;
			return true;
		}
		
		return false;
	}

	@Override
	public Object pop() {
		
		if(isEmpty()) {
			return null;
		}
		
		else {
			return this.vetor[pos--];
		}
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		if(pos < 0) {
			return null;
		}
		else {
			return this.vetor[pos];
		}
		
	}

	@Override
	public boolean isEmpty() {
		if(pos < 0) {
			return true;
		}
		return false;
	}

	@Override
	public int size() {
		return this.vetor.length;
	}

}
