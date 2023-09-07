package topicsAssessed;

public class Car {
	// instance vars
	String color;    // 1st
	String type;
	
	// initialization block; will be run for all of the constructors
	{
		color = "green";    // 2nd
	}
	
	
	// constructors
	public Car() { }
	
	public Car(String color, String type) {
		this.color=color;    // 3rd; the constructor is always executed last
		this.type=type;
	}
	
	
	// member methods
	public static void start() {
		System.out.println("Get Started!");
	}
	
	public void printDescription() {
		System.out.println("This is a "+color+" "+type);
	}
	
	public String getDescription() {
		String desc = "This is a "+color+" "+type;
		return desc;
	}
	
	public static void main(String[] args) {
		Car raceCar = new Car("red","corvette");
		System.out.println(raceCar.color+" "+raceCar.type);
		
		Car soccerVan = new Car();
		soccerVan.color = "navy";
		soccerVan.type = "odyssey";
		System.out.println(soccerVan.getDescription());

	}

}
