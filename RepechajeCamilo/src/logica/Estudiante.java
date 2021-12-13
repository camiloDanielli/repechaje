package logica;

import java.util.ArrayList;

public class Estudiante extends Usuario{
private int nroEstudiante;
private ArrayList<Materia> materia = new ArrayList<Materia>();


public Estudiante(int ci, String nombre, String apellido, int nroEstudiante, ArrayList<Materia> materia) {
	super(ci, nombre, apellido);
	this.nroEstudiante = nroEstudiante;
	this.materia = materia;
}
public int getNroEstudiante() {
	return nroEstudiante;
}
public void setNroEstudiante(int nroEstudiante) {
	this.nroEstudiante = nroEstudiante;
}
public ArrayList<Materia> getMateria() {
	return materia;
}
public void setMateria(ArrayList<Materia> materia) {
	this.materia = materia;
}


}
