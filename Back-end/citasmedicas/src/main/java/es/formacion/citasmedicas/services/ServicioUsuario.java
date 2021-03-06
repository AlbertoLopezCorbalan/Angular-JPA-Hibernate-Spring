package es.formacion.citasmedicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.formacion.citasmedicas.entities.Usuario;
import es.formacion.citasmedicas.repository.RepositorioUsuario;

@Service
public class ServicioUsuario {
	
	@Autowired
	private RepositorioUsuario respositorioUsuario;
	
	public List<Usuario> getUsuarios(){
		return	this.respositorioUsuario.findAll();
	}
	
	public void saveUsuario(Usuario usuario) {
		this.respositorioUsuario.save(usuario);
	}
	
}
