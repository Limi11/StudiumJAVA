
public class DivKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse DivKnoten
	DivKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " / ";
	}
	
	// werteAus wird rekursiev gelöst
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int zähler;
		int nenner;
		// rekursive Auswertung des Zählers
		zähler = erster.werteAus();
		// rekursive Auswertung des Nenners
		nenner = zweiter.werteAus();
		// nenner darf niemals null sein !
		if(nenner == 0) {
			throw new ArithmeticException("Division durch 0!");
		}
		// gibt Ergebnis des Teilbaums zurück
		return zähler/nenner;
	}
}
