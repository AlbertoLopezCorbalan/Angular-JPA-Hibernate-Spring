package es.formacion.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.formacion.citasmedicas.entities.Diagnostico;

@Repository
public interface RepositorioDiagnostico extends JpaRepository<Diagnostico, Integer>{}