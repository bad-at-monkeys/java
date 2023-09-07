package topicsAssessed;

/**
 * PRIMITIVES & OBJECTS
 * 
 * - Store primitive data using a data type suited for the data
 * - Instantiate an instance of a class
 * 
 * @author tbw
 *
 */
public class PrimitivesAndObjects {
	int n;
	double pi;
	char choice;
	boolean flag;
	
	public PrimitivesAndObjects(int n, double pi, char choice, boolean flag) {
		this.n = n;
		this.pi = pi;
		this.choice = choice;
		this.flag = flag;
	}

	public static void main(String[] args) {
		/* Store primtitve data types */
		int n =7;
		double pi = 3.14;
		char choice = 'y';
		boolean flag = true;
		
		/* Instantiate an instance of a class */
		PrimitivesAndObjects po = new PrimitivesAndObjects(n, pi, choice, flag);
		
		/* Test that the data was stored correctly in the po object */
		System.out.println(po.n);
		System.out.println(po.pi);
		System.out.println(po.choice);
		System.out.println(po.flag);
	}

}
