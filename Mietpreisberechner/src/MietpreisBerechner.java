
public class MietpreisBerechner {
	// Hier einen javadoc - Kommentar einfuegen
		public long berechneMietpreis(int tage, int km) {
			int kosten = 0;
			if(tage < 14) {
				kosten = tage*2000;
				if(km <= 200) {
					kosten += 4000;
				}
				else {
					kosten += 4000;
					kosten += ((km-200)*15);
				}
			}
			else {
				kosten = 30000;
				kosten += 12*km;
			}
			System.out.println(kosten);
			return kosten;
		}
}
