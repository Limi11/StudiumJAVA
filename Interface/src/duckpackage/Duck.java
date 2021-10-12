package duckpackage;

public class Duck {
	
	QuackBehavior a;
	
	Duck(QuackBehavior input) {
		this.a = input;
	}
	
	void duckQuack() {
		a.quack();
	}
}
