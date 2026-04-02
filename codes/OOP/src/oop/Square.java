package oop;

import org.javatuples.Pair;

public class Square extends Rectangle {

	//Constructor
		public Square(Pair<Integer, Integer>p1, Pair<Integer, Integer> p2) {	
			if (Math.abs(p1.getValue0() - p2.getValue0())!= Math.abs(p1.getValue1() - p2.getValue1())) {
				throw new IllegalArgumentException("the sides should have the same heigth"); 
			}
			this.p1= p1; 
			this.p2 = p2; 	 
		}

	public static void main(String[] args) {

		Pair<Integer, Integer> p1 = Pair.with(5,2); 
		Pair<Integer, Integer> p2 = Pair.with(8, 5);
		
		Square square = new Square(p1, p2); 
		System.out.println(square);
		System.out.println("My area is: " + square.area());

	}

}
