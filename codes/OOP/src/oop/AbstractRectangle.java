package oop;

import org.javatuples.Pair;

public abstract class AbstractRectangle {

	Pair<Integer, Integer> p1 = new Pair<Integer, Integer>(Integer.valueOf(1), Integer.valueOf(0)); 
	Pair<Integer, Integer> p2 = new Pair<Integer, Integer>(Integer.valueOf(3), Integer.valueOf(1)); 
	
	// Methods
	public abstract int area();
 
}