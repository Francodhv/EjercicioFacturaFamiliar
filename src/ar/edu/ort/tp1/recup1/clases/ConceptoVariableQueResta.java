package ar.edu.ort.tp1.recup1.clases;

public class ConceptoVariableQueResta extends ConceptoVariable {

	public ConceptoVariableQueResta (int suCodigo, String suDescripcion, double suValor) {
		//	TODO COMPLETAR
		super(suCodigo, suDescripcion, suValor);
	}
	

	public double calcularValor(double importeBase) {
		//	TODO COMPLETAR
		return importeBase - (importeBase * (getValor() / 100) - importeBase);
	}	
}
