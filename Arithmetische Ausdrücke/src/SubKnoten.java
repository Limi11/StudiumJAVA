
public class SubKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse SubKnoten
	SubKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " - ";
	}
	
	// werteAus wird rekursiev gelöst
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int minuend;
		int subtrahend;
		// rekursive Auswertung des Zählers
		minuend = erster.werteAus();
		// rekursive Auswertung des Nenners
		subtrahend = zweiter.werteAus();
		// gibt Ergebnis des Teilbaums zurück
		return minuend-subtrahend;
	}

}
