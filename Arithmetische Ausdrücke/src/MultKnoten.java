
public class MultKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse MulKnoten
	MultKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " * ";
	}
	
	
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int multiplikand;
		int multiplikator;
		// rekursive Auswertung des Z�hlers
		multiplikand = erster.werteAus();
		// rekursive Auswertung des Nenners
		multiplikator = zweiter.werteAus();
		// gibt Ergebnis des Teilbaums zur�ck
		return multiplikand*multiplikator;
	}
}
