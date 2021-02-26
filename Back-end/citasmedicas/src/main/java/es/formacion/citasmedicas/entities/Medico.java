package es.formacion.citasmedicas.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;




@SuppressWarnings("serial")

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "Medico")
public class Medico extends Usuario {
	
	@Column(name = "numColegiado")
	private int numColegiado;
	
	
	@JsonBackReference
	@OneToMany(mappedBy = "medico")
	private List<Cita> citas = new LinkedList<Cita>();
	
	
    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
        name = "Medico_Paciente", 
        joinColumns = { @JoinColumn(name = "id_medico") },  // Medico_id
        inverseJoinColumns = { @JoinColumn(name = "id_paciente") } // Paciente_id
    )
    private List<Paciente> pacientes = new LinkedList<Paciente>();


    
    
    
	public Medico() { // Para JPA
		
	}

	public Medico(String nombre, String apellidos, String usuario, String clave, int numColegiado) {
		super(nombre, apellidos, usuario, clave);
		this.numColegiado = numColegiado;
	}

	public int getNumColegiado() {
		return numColegiado;
	}

	public void setNumColegiado(int numColegiado) {
		this.numColegiado = numColegiado;
	}

	public List<Paciente> getPacientes(){
		return new LinkedList<Paciente>(this.pacientes);
	}
	
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	
	public void addPaciente(Paciente pacientes) {
		this.pacientes.add(pacientes);
	}
	public void removePaciente(Paciente paciente) {
		this.pacientes.remove(paciente);
	}
	public List<Cita> getCitas(){
		return new LinkedList<Cita>(this.citas);
	}
	
	public void setCitas(List<Cita> cita) {
		this.citas = cita;
	}
	
	public void addCita(Cita cita) {
		this.citas.add(cita);
	}
	
	public void removeCita(Cita cita) {
		this.citas.remove(cita);
	}
	
}