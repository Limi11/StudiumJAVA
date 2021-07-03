import org.junit.jupiter.api.Test;

class MietpreisBerechnerTest extends junit.framework.TestCase {

	MietpreisBerechner m;
	
	public void setUp() {
		m = new MietpreisBerechner();
	}
	
	@Test
	void testA() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(1, 10);
		assertEquals("Das Ergebnis sollte 6000 sein!", 6000, ergebnis);
	}
	
	@Test
	void testB() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(2, 0);
		assertEquals("Das Ergebnis sollte 8000 sein!", 8000, ergebnis);
	}
	
	@Test
	void testC() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(4, 200);
		assertEquals("Das Ergebnis sollte 12000 sein!", 12000, ergebnis);	
	}
	
	@Test
	void testD() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(8, 250);
		assertEquals("Das Ergebnis sollte 20750 sein!", 20750, ergebnis);
		}
	
	@Test
	void testE() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(11, 199);
		assertEquals("Das Ergebnis sollte 26000 sein!", 26000, ergebnis);
	}
	
	@Test
	void testF() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(13, 150);
		assertEquals("Das Ergebnis sollte 30000 sein!", 30000, ergebnis);
	}
	
	@Test
	void testG() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(14, 150);
		assertEquals("Das Ergebnis sollte 31800 sein!", 31800, ergebnis);
	}
	
	@Test
	void testH() {
		this.setUp();
		long ergebnis = this.m.berechneMietpreis(20, 250);
		assertEquals("Das Ergebnis sollte 33000 sein!", 33000, ergebnis);
	}
	
}
