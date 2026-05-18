package com.programacionIV.trabajos_api_3.repository;
import com.programacionIV.trabajos_api_3.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
} 
    

