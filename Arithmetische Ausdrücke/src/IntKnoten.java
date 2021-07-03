// Die Klasse IntKnoten repräsentiert einen einfachen Zahhlenknoten

public class IntKnoten implements Knoten {

	int wert;
	
	IntKnoten(int wert) {
		this.wert = wert;
	}
	
	@Override
	public int werteAus() {
		return wert;
	}
	
	@Override
	public String toString() {
		return String.valueOf(wert);	
	}

}
