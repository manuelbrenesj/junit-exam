package test;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
import logica.Analytics;

public class Test_Analytics {

	@Test
	public void test_MasLarga() {
		
		String palabras = "Hola como estas";
		
		String[] result = Analytics.masLarga(palabras);
		
		System.out.println(result);
		
		assertEquals("estas",result);
	}
	
}
