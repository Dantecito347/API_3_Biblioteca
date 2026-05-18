package com.programacionIV.trabajos_api_3.service;

import com.programacionIV.trabajos_api_3.entity.Libro;
import com.programacionIV.trabajos_api_3.entity.Prestamo;
import com.programacionIV.trabajos_api_3.entity.Usuario;
import com.programacionIV.trabajos_api_3.repository.LibroRepository;
import com.programacionIV.trabajos_api_3.repository.PrestamoRepository;
import com.programacionIV.trabajos_api_3.repository.UsuarioRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BibliotecaService {
    private final LibroRepository libroRepo;
    private final UsuarioRepository usuarioRepo;
    private final PrestamoRepository prestamoRepo;

    public BibliotecaService(LibroRepository libroRepo, UsuarioRepository usuarioRepo, PrestamoRepository prestamoRepo) {
        this.libroRepo = libroRepo;
        this.usuarioRepo = usuarioRepo;
        this.prestamoRepo = prestamoRepo;
    }

    public Libro crearLibro(Libro libro) { return libroRepo.save(libro); }
    public Usuario crearUsuario(Usuario usuario) { return usuarioRepo.save(usuario); }
    public Prestamo registrarPrestamo(Prestamo prestamo) { return prestamoRepo.save(prestamo); }

    public List<Libro> listarLibros() { return libroRepo.findAll(); }
    public List<Usuario> listarUsuarios() { return usuarioRepo.findAll(); }
    public List<Prestamo> listarPrestamos() { return prestamoRepo.findAll(); }
}
