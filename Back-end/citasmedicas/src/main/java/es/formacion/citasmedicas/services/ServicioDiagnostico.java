package es.formacion.citasmedicas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.formacion.citasmedicas.entities.Diagnostico;
import es.formacion.citasmedicas.repository.RepositorioDiagnostico;

@Service
public class ServicioDiagnostico {
	@Autowired
	private RepositorioDiagnostico repositorioDiagnostico;
	
	public List<Diagnostico> getDiagnosticos(){
		return this.repositorioDiagnostico.findAll();
	}
	
	public void saveDiagnostico(Diagnostico diagnostico) {
		this.repositorioDiagnostico.save(diagnostico);
	}
	
	public Diagnostico getDiagnostico(Diagnostico d) {
		List<Diagnostico> all = repositorioDiagnostico.findAll();

		for(Diagnostico diagnostico : all) { 
			if(d.getValoracionEspecialista().equals(diagnostico.getValoracionEspecialista())
					&& d.getEnfermedad().equals(diagnostico.getEnfermedad()) ){ // Un criterio que sea único, ambas cosas en este caso
			      return diagnostico; // Si existe se devuelve
			}
		}
		return null; // Si no se devuelve null
	}
}
