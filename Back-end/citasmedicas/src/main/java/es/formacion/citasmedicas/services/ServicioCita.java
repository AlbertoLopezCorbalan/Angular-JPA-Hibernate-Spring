package es.formacion.citasmedicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.formacion.citasmedicas.entities.Cita;
import es.formacion.citasmedicas.repository.RepositorioCita;

@Service
public class ServicioCita { // Lo ideal es que todos implementen una interfaz y se use en el otro lado la inferfaz implements IServicioCita {
	@Autowired
	private RepositorioCita repositorioCitas;
	
	public List<Cita> getCitas(){
		return this.repositorioCitas.findAll();
	}
	
	public void saveCita(Cita cita) {
		this.repositorioCitas.save(cita);
	}
	
	
	
}