package ar.edu.ort.tp1.recup1.clases;

public class ConceptoVariableQueSuma extends ConceptoVariable {

	public ConceptoVariableQueSuma (int suCodigo, String suDescripcion, double suValor) {
		super(suCodigo,suDescripcion,suValor);
	}
	

	public double calcularValor(double importeBase) {
		//	TODO COMPLETAR
		return importeBase * (getValor() / 100) + importeBase;
	}
	
}
