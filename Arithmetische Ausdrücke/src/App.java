
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Baum i = Baum.erzeugeBeispielBaum(1, 2, 3, 4, 5);
		System.out.println(i.toString());
		Knoten x = i.liefereWurzel();
		int Ergebnis = x.werteAus();
		System.out.println(Ergebnis);
	}

}
