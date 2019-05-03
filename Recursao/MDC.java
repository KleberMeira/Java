package recursividade;

public class MDC {

	public int mdc(int x, int y) {


		if(x % y == 0) {
			return y;
		}
		else
			return mdc(y, x % y);
		

	}
}