// Das Interface Knoten dient als Vorlage für einen Knoten im Arithmetischen Baum 

public interface Knoten {
	// die Methode werteAus() soll das Ergebnis eines Teilbaums berechnen
	int werteAus();
	// die Methode toString() soll eine passende geklammerte Repräsentation des Knotens und seiner Kinder zurückliefern
	String toString();
}
