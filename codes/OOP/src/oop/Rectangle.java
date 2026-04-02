package oop;


import org.javatuples.Pair;

public class Rectangle{
	Pair<Integer, Integer> p1 = Pair.with(1, 2); 
	Pair<Integer, Integer> p2 = Pair.with(3, 1); 
	
	public Rectangle() {}
	
	//Constructor
	public Rectangle(Pair<Integer, Integer>p1, Pair<Integer, Integer> p2) {	
		this.p1= p1; 
		this.p2 = p2; 	 
	}
	
	// Methods
	public int area() {
	    int width = Math.abs(p1.getValue0() - p2.getValue0());
	    int height = Math.abs(p1.getValue1() - p2.getValue1());
	    return width * height;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return String.format("Rectangle(%s, %s)", this.p1, this.p2);
	}

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle);
		Pair<Integer, Integer> p1 = Pair.with(5,2); 
		Pair<Integer, Integer> p2 = Pair.with(2, 3);
		Rectangle rectangle2 = new Rectangle(p1, p2);
		System.out.println("Point P1 has coordinate: "+rectangle.p1);
		System.out.println("Point P1 in rect 2 has coordinate: "+rectangle2.p1);
		System.out.println("Hello to my rectangle class");
		System.out.println("My rectangle area = "+rectangle.area());
	}
}



