package ar.edu.ort.tp1.recup1;
import ar.edu.ort.tp1.recup1.clases.*;

public class Recup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Escuela miEscuela = new Escuela("TodoSaber",1000);
			System.out.println("cargando familias en la escuela ");
			cargarFamilia(miEscuela,"PEREZ");
			cargarFamilia(miEscuela,"");
			cargarFamilia(miEscuela,"ALVAREZ");
			cargarFamilia(miEscuela,"ALVAREZ");
			cargarFamilia(miEscuela,"RODRIGUEZ");

			System.out.println("creando conceptos");
			Concepto cuota = new Concepto(1,"cuota",10000);
			Concepto comedor = new Concepto(2,"comedor",2000);
			ConceptoVariableQueResta beca = new ConceptoVariableQueResta(1,"beca por hermano",10);
			ConceptoVariableQueSuma materiales = new ConceptoVariableQueSuma(1,"materiales de trabajo",5);

//		carga items (conceptos de cada familia)		
			System.out.println("cargando items a las familias");
			cargarItemFamilia(miEscuela,"PEREZ",1,cuota,3);
			cargarItemFamilia(miEscuela,"PEREZ",2,comedor,3);
			cargarItemFamilia(miEscuela,"PEREZ",3,materiales,3);

			cargarItemFamilia(miEscuela,"ALVAREZ",1,cuota,3);
			cargarItemFamilia(miEscuela,"ALVAREZ",2,comedor,3);
			cargarItemFamilia(miEscuela,"ALVAREZ",3,materiales,3);
			cargarItemFamilia(miEscuela,"ALVAREZ",4,beca,3);

			miEscuela.emitirListadoPreFacturacion();
			
		} catch(RuntimeException re) {
			System.out.println(re.getMessage());
		}
		
	}
	
	public static void cargarFamilia(Escuela laEscuela, String apellido) {
		try {
			laEscuela.agregarFamilia(apellido);
			System.out.println("se agregó la flia. "+apellido);
		} catch (RuntimeException re) {
			System.out.println(re.getMessage());
		}
	}

	public static void cargarItemFamilia(Escuela laEscuela, String apellido,int id, Concepto conce1, int grado) {
		if (laEscuela.cargarItemFamilia(apellido, id, conce1, grado))  {
			System.out.println("item cargado: "+apellido+" "+conce1.getDescripcion());
		} else {
			System.out.println("no se pudo cargar el item!!");
		}
	}
	
}


