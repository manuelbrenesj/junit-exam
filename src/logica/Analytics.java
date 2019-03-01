package logica;

import java.util.ArrayList;
import java.util.Collections;

public class Analytics {

	public static String[] masLarga(String palabras) {
		
		String[] array = palabras.split(" ");
		String masLarga = "";
		int largo = 0;
		ArrayList <String> lista= new ArrayList<>();
		String[] dato = new String[lista.size()];
		
		//Buscar palabra mas larga
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() > masLarga.length()) {		
				masLarga = array[i];	
				largo = masLarga.length();
			}
		}
		
		//Guardarlas en un arreglo
		for(int j = 0; j < array.length; j++) {
			if(array[j].length() == largo) {
				lista.add(array[j]);
				Collections.sort(lista);	
				dato = lista.toArray(dato);
			}
		}
		
		//System.out.println(dato[0].toString() + " " + dato[1].toString());

		return dato;
	}
	
	
	public static String[] masCorta(String palabras) {
		
		String[] array = palabras.split(" ");
		String masCorta = "";
		int corto = 0;
		ArrayList <String> lista= new ArrayList<>();
		String[] dato = new String[lista.size()];
		
		for(int i = 0; i < array.length; i++) {
			
			masCorta = array[i];
			
			if(array[i].length() <= array[0].length()) {		
				masCorta = array[i];	
				corto = masCorta.length();
			}
		}
		
		for(int j = 0; j < array.length; j++) {
			if(array[j].length() == corto) {
				lista.add(array[j]);
				Collections.sort(lista);
				dato = lista.toArray(dato);
			}
		}
		
		return dato;
	}
}




