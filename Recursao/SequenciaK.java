package recursividade;

public class SequenciaK {

	public int sequenciaK(int k, int d) {

		if (k < 10) {

			if (k == d) {
				return 1;
			} else
				return 0;
		}

		if (k % 10 == d) {
			return 1 + sequenciaK(k / 10, d);
		} else
			return 0 + sequenciaK(k / 10, d);

	}

}
