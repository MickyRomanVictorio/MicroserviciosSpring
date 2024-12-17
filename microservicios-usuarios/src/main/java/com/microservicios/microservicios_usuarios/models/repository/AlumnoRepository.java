package com.microservicios.microservicios_usuarios.models.repository;

import com.microservicios.microservicios_usuarios.models.entity.Alumno;
import org.springframework.data.repository.CrudRepository;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {


}
