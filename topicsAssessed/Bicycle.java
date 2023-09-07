package topicsAssessed;

/**
 * CLASSES (blahhhhhhhhhhhh)
 * 
 * - Access the value of an instance var from within a user-defined class.
 * - Alter the value of an instance var from within a user defined class.
 * - Declare a class that, when instantiated as an object, can store primitives
 *     or other objects as accessible state.
 * - Declare a member method within a class.
 * - Declare constructors that initialize a classes state when it is instantiated.
 * - Explicitly use a reference to the current obj...(this).
 * 
 * @author tbw
 *
 */

public class Bicycle {
	/* Fields (Instance var) (Class var) */
	private int cadence;
	private int gear;
	private int speed;
	// instance var to hold ser
	private int serial;
	// class var keeping track of number of Bicycles instantiated
	private static int bicyclesMade = 0;
	
	
	/* CONSTRUCTORS */
	// every Bicycle constructor must contain the serial increment
	public Bicycle() { serial = ++bicyclesMade; }
	
	public Bicycle(int startCadence, int startSpeed, int startGear) {
		cadence = startCadence;
		speed = startSpeed;
		gear = startGear;
		
		serial = ++bicyclesMade;
	}
	
	
	/* CLASS METHODS */
	public int getCadence() { return cadence; }
	public int getGear() { return gear; }
	public int getSpeed() { return speed; }
	public int getSerial() { return serial; }
	public static int getBicyclesMade() { return bicyclesMade; }
	
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void applyBrake(int decrease) {
		speed -= decrease;
	}
	
	public void speedUp(int increase) {
		speed += increase;
	}
	
	public static void main(String[] args) {
		Bicycle b1 =new Bicycle(3, 4, 8);
		System.out.println(b1.speed);
		
		b1.speedUp(5);
		System.out.println(b1.speed);
		
		b1.applyBrake(3);
		System.out.println(b1.speed);

		System.out.println(b1.getSerial());
		
		Bicycle b2 = new Bicycle();
		System.out.println(b2.getSerial());
	}

}
