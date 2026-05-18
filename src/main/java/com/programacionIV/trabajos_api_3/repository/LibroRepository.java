package com.programacionIV.trabajos_api_3.repository;
import com.programacionIV.trabajos_api_3.entity.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
public interface LibroRepository extends JpaRepository<Libro, Long> {
    Libro findByTituloIgnoreCase(String titulo);
}
