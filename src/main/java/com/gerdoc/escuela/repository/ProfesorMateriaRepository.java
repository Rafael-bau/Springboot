package com.gerdoc.escuela.repository;

import com.gerdoc.escuela.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorMateriaRepository extends JpaRepository<Profesor, Long>
{
}
