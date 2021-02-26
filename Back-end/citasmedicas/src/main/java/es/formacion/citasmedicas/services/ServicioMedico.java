package es.formacion.citasmedicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.formacion.citasmedicas.entities.Medico;
import es.formacion.citasmedicas.repository.RepositorioMedico;

@Service
public class ServicioMedico {
	
	@Autowired
	private RepositorioMedico repositorioMedico;
	
	public List<Medico> getMedicos(){
		return	this.repositorioMedico.findAll();
	}
	
	public void saveMedico(Medico medico) {
		this.repositorioMedico.save(medico);
	}
	
	public Medico getMedico(Medico  m) {
		List<Medico> all = repositorioMedico.findAll();

		for(Medico medico : all) { 
			if(m.getNumColegiado() == medico.getNumColegiado()){ // Un criterio que sea único, numColegiado, usuario...
			      return medico; // Si existe se devuelve
			}
		}
		return null; // Si no se devuelve null
	}
}
