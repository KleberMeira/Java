package pacote1;

	public interface ListaLinearInfinita {


		void add(int e);
		void add(int index, int elemento) throws IndexOutOfBoundsException;
		void clear();
		void contains(int elemento);
		boolean equals(ListaLinearInfinita lista);
		int get(int index) throws IndexOutOfBoundsException;
		boolean remove(int elemento) throws IndexOutOfBoundsException;
		int set(int posicao, int elemento) throws IndexOutOfBoundsException;
		int size();

		
	}

