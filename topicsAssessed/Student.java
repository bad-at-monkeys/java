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

public class Student {
	// instance variables
	private String name;
	private int age;
	private char gender;
	// add instance var to store class var
	private int studentID;
	// add a class variable to keep track of Student ID
	private static int studentNumber = 0;
			
			
	/* CONSTRUCTORS */
	// Declare constructors that initialize a class state when instantiated.
	public Student() {};
	// Declare a class that stores primitives or other objects as accessible state once instantiated.
	public Student(String name, int age, char gender) {
	    // this.instanceVar = param
	    this.name = name;    // explicitly use a reference to the current object using this
		this.age = age;
		this.gender = gender;
		// increment student id by one every time a Student obj is instantiated		
		studentID = ++studentNumber;
	}
			
			
	// Declare a member method within a class.
	/* GETTERS */
	// access the value of an instance var from within a user-defined class
	public String getName() {
		return name;
	}		
	public int getAge() {
		return age;
	}		
	public char getGender() {
		return gender;
	}
	public int getStudentID() {
		return studentID;
	}
	// access the static field
	public static int getStudentNumber() {
		return studentNumber;
	}
			
	/* SETTERS */
	// alter the value of an instance var from within a user defined class
	public void setName(String name) {
		this.name = name;
	}	
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
			
	public static void main(String[] args) {
		Student khanh = new Student("Khanh", 16, 'm');
		System.out.println(khanh.getName());	
		System.out.println(khanh.getStudentID());
		
		Student julita = new Student("Julita", 15, 'f');
		System.out.println(julita.getName());
		System.out.println(julita.getStudentID());
	}
} // Student

