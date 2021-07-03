
public class AddKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse AddKnoten
	AddKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " + ";
	}
	
	// werteAus wird rekursiev gelöst
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int ersterSummand;
		int zweiterSummand;
		// rekursive Auswertung des Zählers
		ersterSummand = erster.werteAus();
		// rekursive Auswertung des Nenners
		zweiterSummand = zweiter.werteAus();
		// gibt Ergebnis des Teilbaums zurück
		return ersterSummand+zweiterSummand;
	}
	
	@Override
	public String toString() {
		String Ausgabe = "(" + this.erster.toString() + " + " + this.zweiter.toString() + ")";
		return Ausgabe;	
	}

}
