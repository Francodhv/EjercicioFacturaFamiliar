package ar.edu.ort.tp1.recup1.clases;

import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeFamilias extends ListaOrdenadaNodos<String, Familia> {
	
	@Override
	public int compare(Familia dato1, Familia dato2) {
		return dato1.getApellido().compareTo(dato2.getApellido());
	}

	@Override
	public int compareByKey(String clave, Familia elemento) {
		return clave.compareTo(elemento.getApellido());
	}
	
	

}
