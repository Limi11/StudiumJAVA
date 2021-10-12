package duckpackage;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuackBehavior softDuck = new SoftQuack();
		QuackBehavior strongDuck = new StrongQuack();
		Duck eins = new Duck(softDuck);
		Duck zwei = new Duck(strongDuck);
		eins.duckQuack();
		zwei.duckQuack();

	}

}
