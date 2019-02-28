package logica;

import java.util.ArrayList;

public class Analytics {

	public static String[] masLarga(String palabras) {
		
		String[] array = palabras.split(",");
		String masLarga = "";
	
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i].length() < masLarga.length()) {	

				ArrayList <String> lista= new ArrayList<>();
				
				lista.add(array[i]);
				
				Object[] dato = lista.toArray();
				String[] retorno = new String[dato.length];
				
				for(int j = 0; j < retorno.length; j++) {
					retorno[j] = dato[j];
				}
				
				return retorno;
			}
		}
		
		return array;
	}
	
	
	

}

