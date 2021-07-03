
public class Baum {
	
	Knoten wurzel; 
	
	// Konstruktor der Klasse Baum
	Baum(Knoten wurzel) {
		this.wurzel = wurzel;
	}
	
	public int werteAus() {
		return this.wurzel.werteAus();
	}
	
	public String toString() {
		return this.wurzel.toString();
	}
	
	public Knoten liefereWurzel() {
		return this.wurzel;
	}
	
	public static Baum erzeugeBeispielBaum(int a, int b, int c, int d, int e) {
		// erzeuge IntKnoten
		IntKnoten inta = new IntKnoten(a);
		IntKnoten intb = new IntKnoten(b);
		IntKnoten intc = new IntKnoten(c);
		IntKnoten intd = new IntKnoten(d);
		IntKnoten inte = new IntKnoten(e);
		// erzeuge BinaerOperatorKnoten
		MultKnoten multi = new MultKnoten(inta, intb);
		SubKnoten sub = new SubKnoten(intd, inte);
		DivKnoten div = new DivKnoten(intc, sub);
		AddKnoten add = new AddKnoten(multi, div);
		// erzeuge Baum
		Baum BeispielBaum = new Baum(add);
		return BeispielBaum;
	}
}
