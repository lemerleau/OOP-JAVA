package oop;

public class ButterFly extends Worm, Fly
{

public String name; 
	
	public ButterFly(String name) {
		this.name = name;

	}

	public void eat() {
		System.out.println(this.name +" is nibbling...");
	}
	
	public static void main(String[] args) {
		Fly fly = new Fly("nono");
		fly.eat();
	}
}
