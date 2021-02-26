package es.formacion.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.formacion.citasmedicas.entities.Paciente;

@Repository
public interface RepositorioPaciente extends JpaRepository<Paciente, Integer> {}
