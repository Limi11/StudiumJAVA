// Das Interface Knoten dient als Vorlage f�r einen Knoten im Arithmetischen Baum 

public interface Knoten {
	// die Methode werteAus() soll das Ergebnis eines Teilbaums berechnen
	int werteAus();
	// die Methode toString() soll eine passende geklammerte Repr�sentation des Knotens und seiner Kinder zur�ckliefern
	String toString();
}
