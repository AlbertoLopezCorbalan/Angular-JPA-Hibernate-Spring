package es.formacion.citasmedicas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.formacion.citasmedicas.entities.Usuario;

@Repository
public interface RepositorioUsuario extends JpaRepository<Usuario, Integer>  {}
