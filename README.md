# API REST sencilla pero funcional para la gestión de una **biblioteca**. Permite administrar libros, usuarios y préstamos de manera eficiente.

Proyecto desarrollado como parte del aprendizaje de Spring Boot, Spring Data JPA y buenas prácticas básicas de desarrollo backend.

## 🚀 Características

- CRUD completo de Libros y Usuarios
- Gestión de Préstamos con relaciones entre entidades
- Persistencia con **H2 Database** (consola incluida)
- Script SQL de inicialización
- Estructura por capas (Controller → Service → Repository)
- Documentación clara de endpoints

## 🛠️ Tecnologías Utilizadas

- **Java 21**
- **Spring Boot 4.0.6**
- Spring Data JPA
- H2 Database
- Maven (con Wrapper)
- Spring Web

## Estructura del Proyecto
src/main/java/com/programacionIV/trabajos_api_3/
├── TrabajosApi3Application.java
├── controller/
│   └── BibliotecaController.java
├── service/
│   └── BibliotecaService.java
├── entity/
│   ├── Libro.java
│   ├── Usuario.java
│   └── Prestamo.java
├── repository/
│   ├── LibroRepository.java
│   ├── UsuarioRepository.java
│   └── PrestamoRepository.java
└── resources/
├── application.properties
└── script.sql
text## 📋 Entidades

- **Libro**: `id`, `titulo`, `autor`, `anio`
- **Usuario**: `id`, `nombre`, `email` (único)
- **Prestamo**: `id`, `fechaPrestamo`, `fechaDevolucion`, relación con `Libro` y `Usuario`
