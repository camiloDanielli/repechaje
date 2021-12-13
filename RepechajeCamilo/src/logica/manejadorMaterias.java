package logica;

public class manejadorMaterias {

	
	public Materia newMateria(int codigo, String nombre){
		Materia materia = null;
		materia.setCodigo(codigo);
		materia.setNombre(nombre);
		return materia;
	}
	
}
