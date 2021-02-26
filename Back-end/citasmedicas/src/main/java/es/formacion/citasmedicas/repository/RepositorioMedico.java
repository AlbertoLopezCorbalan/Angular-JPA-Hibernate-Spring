package es.formacion.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.formacion.citasmedicas.entities.Medico;

@Repository
public interface RepositorioMedico extends JpaRepository<Medico, Integer> {}
