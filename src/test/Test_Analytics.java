package test;

import static org.junit.Assert.assertArrayEquals;
import org.junit.jupiter.api.Test;
import logica.Analytics;

public class Test_Analytics {

	@Test
	public void test_MasLarga() {
		
		String palabras1 = "yo vivo en casa";
		String palabras2 = "casa casota casototota";
		
		String [] esperado1 = {"vivo", "casa"};
		String [] esperado2 = {"casototota"};
		
		String[] result1 = Analytics.masLarga(palabras1);
		String[] result2 = Analytics.masLarga(palabras2);
		
		assertArrayEquals(esperado1, result1);
		assertArrayEquals(esperado2, result2);	
	}
	
	@Test
	public void test_MasCorta() {
		
		String palabras1 = "yo vivo en casa";
		String palabras2 = "casa casota casototota";
		
		String [] esperado1 = {"yo", "en"};
		String [] esperado2 = {"casa"};
		
		String[] result1 = Analytics.masCorta(palabras1);
		String[] result2 = Analytics.masCorta(palabras2);
		
		assertArrayEquals(esperado1, result1);
		assertArrayEquals(esperado2, result2);	
	}
	
}
