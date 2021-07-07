
public class App {

	public static void main(String[] args) {
		int intTestarray[] = {1,2,4,3,6,3,1,2,2,2,3,4};
		String stringTestarray[] = {"ha", "hi", "ho", "ka"};
		Suchen test = new Suchen(intTestarray, stringTestarray);
		int anzahl = test.bestimmeAnzahlInt(2);
		System.out.println(anzahl);
		boolean stringEnthalten = false;
		stringEnthalten = test.istEnthaltenString("hsda");
		System.out.println(stringEnthalten);
		
		

	}

}
