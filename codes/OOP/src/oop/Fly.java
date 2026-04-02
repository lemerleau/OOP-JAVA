package oop;

import org.javatuples.Pair;

public class Fly {
	public String name; 
	public Pair<Wing, Wing> wings;
	
	public Fly(String name, Wing left, Wing right) {
		this.name = name;
		this.wings = Pair.with(left, right);

	}

	public void eat() {
		System.out.println(this.name +" is nibbling...");
	}
	
	public void fly() {
		System.out.println("Hi! I can fly. ");
	}
	
	public static void main(String[] args) {
		Wing left = new Wing("Left", 5, "White");
		Wing right = new Wing("Right", 5, "White");
		Fly fly = new Fly("nono", left, right);
		fly.eat();
		fly.fly();
		
	}
	
}
