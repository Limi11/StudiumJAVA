
public class Suchen {
	
	int intDaten[];
	String stringDaten[];
	
	Suchen (int intDaten[], String stringDaten[]) {
		this.intDaten = intDaten;
		this.stringDaten = stringDaten;
	}
	
	int bestimmeAnzahlInt(int wert) {
		int zähler = 0;
		for(int i: this.intDaten) {
			if(i == wert) {
				zähler++;
			}
		}
		return zähler;
	}
	
	boolean istEnthaltenString(String wert) {
		for(int i = 0; i<stringDaten.length; i++) {
			if(wert == stringDaten[i]) {
				return true;
			}			
		}
		return false;
	}
	
	
	
	
	
	

}
 