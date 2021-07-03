// Die Klasse BinaerOperaotorKnoten repräsentiert einen Knoten für eine arithmetische Operation
import java.lang.IllegalArgumentException;

public abstract class BinaerOperatorKnoten implements Knoten {
	
	Knoten erster;
	Knoten zweiter;
	String operator = "";
	
	BinaerOperatorKnoten(Knoten erster, Knoten zweiter) {
		if(erster == null || zweiter == null) {
			throw new IllegalArgumentException();
		}
		this.erster = erster;
		this.zweiter = zweiter;
	}
	
	@Override
	public String toString() {
		String Ausgabe = "(" + this.erster.toString() + this.operator + this.zweiter.toString() + ")";
		return Ausgabe;	
	}
	
	Knoten liefereErstenOperand() {
		return this.erster;	
	}
	
	Knoten liefereZweitenOperand() {
		return this.zweiter;
	}

}
