package ar.edu.ort.tp1.recup1.clases;

public class Escuela {

	private String nombre;
	private double arancelBase;
//	COMPLETAR ESTRUCTURAS
	private ListaDeFamilias listaDeFamilias;

	public Escuela(String nombre, double arancelBase) {
		//	TODO COMPLETAR
		setNombre(nombre);
		setArancelBase(arancelBase);
		listaDeFamilias = new ListaDeFamilias();
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		if(nombre == null || nombre.isEmpty()) {
			throw new RuntimeException("Nombre no puede ser nulo ni vacio");
		}
		this.nombre = nombre;
	}
	
	public double getArancelBase() {
		return arancelBase;
	}

	private void setArancelBase(double arancelBase) {
		if(arancelBase<0) {
			throw new RuntimeException("El arancel no puede ser negativo");
		}
		this.arancelBase = arancelBase;
	}

	private Familia buscarFamilia(String apellido) {
		return listaDeFamilias.search(apellido);
	}
	
	public void agregarFamilia(String apellido) {
		//	TODO COMPLETAR
		Familia familia = buscarFamilia(apellido);
		if(familia!=null) {
			throw new RuntimeException("La familia ya existe");
		}else {
			listaDeFamilias.add(new Familia(apellido));
		}
	}

	public boolean cargarItemFamilia(String apellido, int id, Concepto conceptoACargar, int grado) {
		//	TODO COMPLETAR
		boolean pudoCargar = false;
		Familia familia = buscarFamilia(apellido);
		if(familia==null) {
			throw new RuntimeException("Familia inexistente");
		}else {
			familia.cargarItem(id, grado, conceptoACargar);
			pudoCargar = true;
		}
		return pudoCargar;
	}

	public void emitirListadoPreFacturacion() {
		System.out.println("Detalle de importes a facturar por familia:");
		// TODO COMPLETAR
		for (Familia familia : listaDeFamilias) {
			System.out.println(familia.getApellido()+ " facturar " +familia.calcularTotalFacturar(arancelBase));
		}
		
	}
	
}
