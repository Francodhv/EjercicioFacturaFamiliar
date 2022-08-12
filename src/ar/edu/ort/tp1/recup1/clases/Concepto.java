package ar.edu.ort.tp1.recup1.clases;

public class Concepto {

	private int codigo;
	private String descripcion;
	private double valor;
	
	public Concepto (int suCodigo, String suDescripcion, double suValor) {
		this.setCodigo(suCodigo);
		this.setDescripcion(suDescripcion);
		this.setValor(suValor);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Concepto [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}
	
	public double calcularValor() {
		return this.getValor();
	}	

	
}
