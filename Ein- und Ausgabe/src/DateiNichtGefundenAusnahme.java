


public class DateiNichtGefundenAusnahme extends Exception  {
	
	// Die super Klasse Exception implementiert die Klasse Serializable deshalb sollte hier eine ID vergeben werden
	private static final long serialVersionUID = 7598559166466776557L;
	
	// In diesem String wird der Dateiname gespeichert
	private String dateiname;
	
	// Konstruktor liest Dateinmane als String ein und übergibt an Superklasse Exception die Fehlermeldung 
	public DateiNichtGefundenAusnahme(String dateiname) {
		super("Datei wurde nicht gefunden.");
		this.dateiname = dateiname;
	}
	
	// Methode liefere Dateiname gibt den gespeicherten Dateinamen zurück
	public String liefereDateinamen() {
		return this.dateiname;
	}
}
