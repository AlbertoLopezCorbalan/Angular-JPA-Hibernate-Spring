package es.formacion.citasmedicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.formacion.citasmedicas.entities.Paciente;
import es.formacion.citasmedicas.repository.RepositorioPaciente;

@Service
public class ServicioPaciente {

	@Autowired
	private RepositorioPaciente repositorioPaciente;
	
	public List<Paciente> getPacientes(){
		return this.repositorioPaciente.findAll();
	}
	
	
	public void savePaciente(Paciente paciente) {
		this.repositorioPaciente.save(paciente);
	}
	
	public Paciente getPaciente(Paciente p) {
		List<Paciente> all = repositorioPaciente.findAll();

		for(Paciente paciente : all) { 
			if(p.getUsuario().equals(paciente.getUsuario())){ // Un criterio que sea único, NSS, usuario...
			      return paciente; // Si existe se devuelve
			}
		}
		return null; // Si no se devuelve null
	}
	
}