package ar.edu.ort.tp1.recup1.clases;

public class ItemDeFactura {

	private int id;
	private Concepto concepto;
	private int grado;
	
	public ItemDeFactura(int id,Concepto concepto, int grado) {
		this.setId(id);
		this.setConcepto(concepto);
		this.setGrado(grado);
	}

	
	public int getId() {
		return id;
	}


	private void setId(int id) {
		this.id = id;
	}


	public Concepto getConcepto() {
		return concepto;
	}

	private void setConcepto(Concepto concepto) {
		this.concepto = concepto;
	}

	public int getGrado() {
		return grado;
	}

	private void setGrado(int grado) {
		if(grado<1 || grado>7) {
			throw new RuntimeException("Grado fuera de rango");
		}
		this.grado = grado;
	}

	@Override
	public String toString() {
		return "ItemDeFactura [concepto=" + concepto + ", grado=" + grado + "]";
	}


	public double dameValor(double base) {
		// TODO Auto-generated method stub
		return concepto.calcularValor();
	}
	
	
}
