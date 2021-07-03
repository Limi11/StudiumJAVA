
public class SubKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse SubKnoten
	SubKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " - ";
	}
	
	// werteAus wird rekursiev gel�st
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int minuend;
		int subtrahend;
		// rekursive Auswertung des Z�hlers
		minuend = erster.werteAus();
		// rekursive Auswertung des Nenners
		subtrahend = zweiter.werteAus();
		// gibt Ergebnis des Teilbaums zur�ck
		return minuend-subtrahend;
	}

}
