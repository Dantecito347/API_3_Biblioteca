package com.programacionIV.trabajos_api_3.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.programacionIV.trabajos_api_3.entity.Libro;
import com.programacionIV.trabajos_api_3.entity.Prestamo;
import com.programacionIV.trabajos_api_3.entity.Usuario;
import com.programacionIV.trabajos_api_3.service.BibliotecaService;

@RestController
@RequestMapping("/biblioteca")
public class BibliotecaController {
    private final BibliotecaService service;

    public BibliotecaController(BibliotecaService service) {
        this.service = service;
    }

    @PostMapping("/libros")
    public Libro crearLibro(@RequestBody Libro libro) {
        return service.crearLibro(libro);
    }

    @GetMapping("/libros")
    public List<Libro> listarLibros() {
        return service.listarLibros();
    }

    @PostMapping("/usuarios")
    public Usuario crearUsuario(@RequestBody Usuario usuario) {
        return service.crearUsuario(usuario);
    }

    @GetMapping("/usuarios")
    public List<Usuario> listarUsuarios() {
        return service.listarUsuarios();
    }

    @PostMapping("/prestamos")
    public Prestamo registrarPrestamo(@RequestBody Prestamo prestamo) {
        return service.registrarPrestamo(prestamo);
    }

    @GetMapping("/prestamos")
    public List<Prestamo> listarPrestamos() {
        return service.listarPrestamos();
    }
}
