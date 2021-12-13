package logica;

import persistencia.manejadorDB;

public class manejadorUsuarios {

	public void create(Usuario usuario) {
		manejadorDB.createUsuario(usuario.getCi(), usuario.getNombre(), usuario.getApellido());
	}

	public void delete(Usuario usuario) {
		manejadorDB.deleteUsuario(usuario.getCi());
	}

	public void update(Usuario usuario) {
		manejadorDB.updateUsuario(usuario.getCi(),usuario.getNombre(), usuario.getApellido());
	}
	public void get() {
	}
}
