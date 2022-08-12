package ar.edu.ort.tp1.recup1.clases;


import ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaDeItems extends ListaOrdenadaNodos<Integer, ItemDeFactura>{
	
	@Override
	public int compare(ItemDeFactura dato1, ItemDeFactura dato2) {
		return dato1.getId() - dato2.getId();
	}

	@Override
	public int compareByKey(Integer clave, ItemDeFactura elemento) {
		return clave - elemento.getId();
	}

}
