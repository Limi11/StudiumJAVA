
public class DivKnoten extends BinaerOperatorKnoten {

	// Konstruktor der Klasse DivKnoten
	DivKnoten(Knoten erster, Knoten zweiter) {
		super(erster, zweiter);
		this.operator = " / ";
	}
	
	// werteAus wird rekursiev gel�st
	@Override
	public int werteAus() {
		// lokale variablen zur Auswertung
		int z�hler;
		int nenner;
		// rekursive Auswertung des Z�hlers
		z�hler = erster.werteAus();
		// rekursive Auswertung des Nenners
		nenner = zweiter.werteAus();
		// nenner darf niemals null sein !
		if(nenner == 0) {
			throw new ArithmeticException("Division durch 0!");
		}
		// gibt Ergebnis des Teilbaums zur�ck
		return z�hler/nenner;
	}
}
