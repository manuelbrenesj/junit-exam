package test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import logica.Analytics;

public class Test_Analytics {

	@Test
	public void test_MasLarga() {
		
		String palabras1 = "yo vivo en casa";
		String palabras2 = "casa casota casototota";
		
		String [] esperado1 = {"casa", "vivo"};
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
		
		String [] esperado1 = {"en", "yo"};
		String [] esperado2 = {"casa"};
		
		String[] result1 = Analytics.masCorta(palabras1);
		String[] result2 = Analytics.masCorta(palabras2);
		
		assertArrayEquals(esperado1, result1);
		assertArrayEquals(esperado2, result2);	
	}
	
	@Test
	public void test_MasLargaAlfabeticamente() {
		
		String palabras1 = "yo vivo en casa";
		String [] esperado1 = {"casa", "vivo"};
		
		String[] result1 = Analytics.masLarga(palabras1);
		
		assertArrayEquals(esperado1, result1);	
	}
	
	@Test
	public void test_MasCortaAlfabeticamente() {
		
		String palabras1 = "yo vivo en casa";
		String [] esperado1 = {"en", "yo"};
		
		String[] result1 = Analytics.masCorta(palabras1);
		
		assertArrayEquals(esperado1, result1);	
	}
	
	@Test
	public void test_PrimeraMasLarga() {
		
		String palabras1 = "yo vivo en casa";		
		
		String result1 = Analytics.primeraMasLarga(palabras1);
		
		assertEquals("vivo", result1);
	}
	
}
