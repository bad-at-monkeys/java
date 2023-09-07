package topicsAssessed;


/**
 * METHODS
 * 
 * - Call a method on an object instantiation of a user-defined class.
 * - Predict whether changes a method makes will be visible to the caller.
 * - Create a method that implements a desired algorithm.
 * 
 * @author tbw
 *
 */

// the user-defined class
public class Methods {
	int l;
	int w;
	
	// make a constructor so we can do this thing
	public Methods(int l, int w) {
		this.l = l;
		this.w = w;
	}
	
	// create a method that implements a desired algorithm
	public int calcArea() {
		return l * w;
	}
	
	// predict whether changes a method makes are visible to the user
	public static void main(String[] args) {
		// instantiate the object
		Methods box1 = new Methods(3,5);
		// call a method on the object of the Methods class i created
		box1.calcArea();    // not visible to the user; returns 15
		
		Methods box2 = new Methods(9,2);
		System.out.println(box2.calcArea());    // this is visible to the user at STDOUT
		
	}

}
