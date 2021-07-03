// import java.io.FileOutputStream;
// import java.io.OutputStream;

import java.io.IOException;


public class App {

	public static void main(String[] args) throws IOException, DateiNichtGefundenAusnahme {
		// TODO Auto-generated method stub
		DateiSortierer a = new DateiSortierer();
		/*try {
		a.einlesen("lustig.txt");
		}
		catch (DateiNichtGefundenAusnahme e) {
			System.out.println("hahah");
		} */
		StringListe a1 = new StringListe();
		a1.add("bio");
		a1.add("aio");
		a1.add("aaa");
		a1.add("bra");
		/*
		StringListe b = a.sortiere(a1);
		for(int i=0; i<b.size(); i++) {
			System.out.println(b.get(i));
		}
		OutputStream x = new FileOutputStream("testfile.txt");
		a.gebeAus(x, a1); */
		String File = "tetfile.txt";
		a.sortiereDatei(File);
	}
}
