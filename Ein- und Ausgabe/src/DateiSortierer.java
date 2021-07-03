import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.io.File;


public class DateiSortierer {
	
	StringListe liste;
	
	// Konstruktor der Klasse DateiSortierer
	public DateiSortierer() {
		this.liste = new StringListe();
	}
	
	// Methode einlesen gibt den Inhalt einer Datei zeilenweise als Liste von Strings zurück
	public StringListe einlesen(String dateiname) throws DateiNichtGefundenAusnahme, IOException {
		BufferedReader reader = null;
		String currentLine;
		
		File f = new File(dateiname);
		
		if(f.exists() != true) {
			throw new DateiNichtGefundenAusnahme(dateiname);
		}
		
		reader = new BufferedReader(new FileReader(dateiname));
		
		while((currentLine = reader.readLine()) != null) {
			this.liste.add(currentLine);
		}
		
		reader.close();
		
		return this.liste;
			
	}
		
	
	// Methode sortiere sortiert eine Liste von Strings aufsteigend lexikographisch und gibt eine sortierte Liste von Strings zurück 
	public StringListe sortiere(StringListe unsortierteListe) throws IllegalArgumentException {
		
		if(unsortierteListe == null) {
		throw new IllegalArgumentException("null ist ein ungueltiges Argument.");
		}
		
		// Verwende bestehende java.util.collection API Funktion um das Sortieren nicht selber implementieren zu müssen 
		Collections.sort(unsortierteListe);
		
		return unsortierteListe;
	}
	
	
	// Methode gebeAus soll die in der Liste übergebenen Zeichenketten auf dem Ausgabestrom out zeilenweise ausgeben
	public void gebeAus(OutputStream out, StringListe Zeilen) throws IOException {
		for(int i = 0; i<Zeilen.size(); i++) {
			out.write(Zeilen.get(i).getBytes(), 0, Zeilen.get(i).length());
			// 10 entspricht Zeilenumbruch
			out.write(10);
			}
		}
	
	// Methode sortiereDatei soll den Inhalt einer Datei einlesen, sortieren und anschließend auf der Standardausgabe wieder ausgeben
	public void sortiereDatei(String dateiname) {
		StringListe unsortiert = new StringListe();
		StringListe sortiert = new StringListe();
		try {
			unsortiert = this.einlesen(dateiname);
			sortiert = this.sortiere(unsortiert);
			for(int i=0; i<sortiert.size(); i++) {
				System.out.println(sortiert.get(i));
			}
		}
		catch(DateiNichtGefundenAusnahme e) {
			System.err.println("Die Datei " + dateiname + " konnte nicht gefunden werden.");
		} 
		catch (IOException e) {
			
			System.err.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
	
