package es.formacion.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.formacion.citasmedicas.entities.Cita;

@Repository
public interface RepositorioCita extends JpaRepository<Cita, Integer>{}
