package com.microservicios.microservicios_usuarios.services;

import com.microservicios.microservicios_usuarios.models.entity.Alumno;

import java.util.List;
import java.util.Optional;

public interface AlumnoService {

    public Iterable<Alumno> findAll();

    public Optional<Alumno> findById(Long id);

    public Alumno save(Alumno alumno);

    public void deleteById(Long id);

}
