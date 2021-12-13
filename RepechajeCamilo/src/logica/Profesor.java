package logica;

import java.util.ArrayList;

public class Profesor extends Usuario{

	private int matricula;
	private ArrayList<Materia> materia = new ArrayList<Materia>();
	
	public Profesor(int ci, String nombre, String apellido, int matricula, ArrayList<Materia> materia) {
		super(ci, nombre, apellido);
		this.matricula = matricula;
		this.materia = materia;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public ArrayList<Materia> getMateria() {
		return materia;
	}

	public void setMateria(ArrayList<Materia> materia) {
		this.materia = materia;
	}

	
}
