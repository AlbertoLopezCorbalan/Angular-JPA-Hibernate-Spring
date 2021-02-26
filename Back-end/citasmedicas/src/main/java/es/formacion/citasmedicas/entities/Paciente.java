package es.formacion.citasmedicas.entities;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;


@SuppressWarnings("serial")

@Entity
@PrimaryKeyJoinColumn(name = "id")
@Table(name = "Paciente")
public class Paciente extends Usuario {

	// (El Id se hereda del padre)
	
	@Column(name = "nss")
	private String nss;
	
	@Column(name = "numTarjeta")
	private String numTarjeta;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "direccion")
	private String direccion;
	
	@ManyToMany(mappedBy = "pacientes")
	private List<Medico> medicos = new LinkedList<Medico>();
	
	@JsonBackReference
	@OneToMany(mappedBy = "paciente")
	private List<Cita> citas = new LinkedList<Cita>();
	
	
	
	
	public Paciente() { // Para JPA
		
	}

	public Paciente(String nombre, String apellidos, String usuario, String clave, String nss, String numTarjeta,
			String telefono, String direccion) {
		super(nombre, apellidos, usuario, clave);
		this.nss = nss;
		this.numTarjeta = numTarjeta;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNSS() {
		return nss;
	}

	public void setNSS(String nSS) {
		nss = nSS;
	}

	public String getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(String numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public List<Medico> getMedicos(){
		return new LinkedList<Medico>(this.medicos);
	}
	
	public void setMedicos(List<Medico> medicos) {
		this.medicos = medicos;
	}
	
	public void addMedico(Medico medico) {
		this.medicos.add(medico);
	}
	
	public void removeMedico(Medico medico) {
		this.medicos.remove(medico);
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
