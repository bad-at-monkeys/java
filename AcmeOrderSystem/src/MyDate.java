
public class MyDate {
	// field/member vars
	int month;
	int day;
	int year;
	
	// initialization block defaults the date
	{
		month=1;
		day=1;
		year=2000;		
	}
	
	// constructors
	public MyDate() {}    // no-arg
	
	public MyDate(int m, int d, int y) {    // parameterized 
		setDate(m,d,y);    // we can use setDate() to set the params
	}
	
	
	// member methods
	public String toString() {
		return month+"/"+day+"/"+year;
	}
	
	public void setDate(int m, int d, int y) {
		month=m;
		day=d;
		year=y;
	}
}
