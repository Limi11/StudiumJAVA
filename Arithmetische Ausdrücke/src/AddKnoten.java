
public class AddKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse AddKnoten
	AddKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " + ";
	}
	
	// werteAus wird rekursiev gel�st
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int ersterSummand;
		int zweiterSummand;
		// rekursive Auswertung des Z�hlers
		ersterSummand = erster.werteAus();
		// rekursive Auswertung des Nenners
		zweiterSummand = zweiter.werteAus();
		// gibt Ergebnis des Teilbaums zur�ck
		return ersterSummand+zweiterSummand;
	}
	
	@Override
	public String toString() {
		String Ausgabe = "(" + this.erster.toString() + " + " + this.zweiter.toString() + ")";
		return Ausgabe;	
	}

}
