package topicsAssessed;

public class Point {
	int x;
	int y;
	    
	public Point() { };
	    
	public Point(int x, int y) {
	    this.x=x;
	    this.y=y;
	}
	    
	public static void main(String[] args) {
	    Point p = new Point(3,5);    // with the param-constructor
	    System.out.println(p.x+" "+p.y);
	        
	    Point p2 = new Point();    // with the default constructor
	    p2.x = 2;
	    p2.y = 5;
	    System.out.println(p2.x+" "+p2.y);
	    
	}

}
