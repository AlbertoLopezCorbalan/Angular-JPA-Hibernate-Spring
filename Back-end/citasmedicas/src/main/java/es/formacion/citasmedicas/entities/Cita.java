package es.formacion.citasmedicas.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;




@SuppressWarnings("serial")

@Entity
@Table(name = "Cita")
public class Cita implements Serializable {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	
	@Column(name = "fechaHora")
	private Date fechaHora;
	
	@Column(name = "motivoCita")
	private String motivoCita;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Diagnostico diagnostico;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Medico medico;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Paciente paciente;
	
	
	public Cita() { // Para JPA
		
	}
	
	
	public Cita(Date fechaHora, String motivo, Diagnostico diagnostico, Medico medico, Paciente paciente) {
		this.fechaHora = fechaHora;
		this.motivoCita = motivo;
		this.diagnostico = diagnostico;
		this.paciente = paciente;
		this.medico = medico;
		// Se registran las nuevas relaciones
		this.paciente.addCita(this);
		this.medico.addCita(this);
		this.medico.addPaciente(this.paciente);
		this.paciente.addMedico(this.medico);
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getMotivoCita() {
		return motivoCita;
	}
	public void setMotivoCita(String motivo) {
		this.motivoCita = motivo;
	}
	public Diagnostico getDiagnostico() {
		return this.diagnostico;
	}
	public void setDiagnostico(Diagnostico diagnostico) {
		this.diagnostico = diagnostico;
	}
	public Medico getMedico() {
		return this.medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente()  {
		return this.paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
		
}
