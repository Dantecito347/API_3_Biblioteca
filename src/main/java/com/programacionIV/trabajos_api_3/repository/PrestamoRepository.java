package com.programacionIV.trabajos_api_3.repository;
import com.programacionIV.trabajos_api_3.entity.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
    java.util.List<Prestamo> findByUsuarioId(Long usuarioId);
}
