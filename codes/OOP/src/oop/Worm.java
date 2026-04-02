package oop;

public class Worm {
	public String name;
	
	public Worm(String name) {
		this.name = name; 
	}

	public void eat() {
		System.out.println(this.name +" is swallowing...");
	}
	
	public static void main(String[] args) {
		Worm worm = new Worm("nono");
		worm.eat();
	}
}
