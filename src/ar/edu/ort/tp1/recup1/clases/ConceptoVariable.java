package ar.edu.ort.tp1.recup1.clases;

public abstract class ConceptoVariable extends Concepto {

//	TODO COMPLETAR
	
	
	public ConceptoVariable (int suCodigo, String suDescripcion, double suValor) {
	//  TODO COMPLETAR
		super(suCodigo, suDescripcion, suValor);
		
	}
	
	
	public abstract double calcularValor(double importeBase);
	
}
	