package ar.edu.ort.tp1.recup1.clases;

public class Familia {
	
//	COMPLETAR ESTRUCTURAS
	private String apellido;
	private ListaDeItems items;

	public Familia (String apellido){
		//	TODO COMPLETAR
		setApellido(apellido);
		items = new ListaDeItems();
	}
	
	public void cargarItem(int id,int grado,Concepto conceptoACargar) {
		// TODO COMPLETAR
		ItemDeFactura item = items.search(id);
		if(item!=null) {
			throw new RuntimeException("Item existente");
		}else {
			items.add(new ItemDeFactura(id, conceptoACargar, grado));
		}
	}
	
	public String getApellido() {
		return apellido;
	}

	private void setApellido(String apellido) {
		//	TODO COMPLETAR
		if(apellido==null || apellido.isEmpty()) {
			throw new RuntimeException("La familia debe tener un apellido, No pudo crear");
		}
		this.apellido = apellido;
	}
	
	public double calcularTotalFacturar(double arancelBase) {
		double total=0;
		// TODO COMPLETAR
		for (ItemDeFactura i : items) {
			total+=+i.dameValor(arancelBase);
		}
      
		return total;
	}

}
