package com.programacionIV.trabajos_api_3.entity;
import jakarta.persistence.*;

@Entity
public class Libro {
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String autor;
    private Integer anio;

    public Libro() {}

    public Libro(String titulo, String autor, Integer anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getTitulo() {return titulo;}
    public void setTitulo(String titulo) {this.titulo = titulo;}
    public String getAutor() {return autor;}
    public void setAutor(String autor) {this.autor = autor;}
    public Integer getAnio() {return anio;}
    public void setAnio(Integer anio) {this.anio = anio;}
}
