# Trabajos API 3 — Resumen del proyecto

Descripción

API REST sencilla para gestionar una biblioteca: libros, usuarios y préstamos.

Tecnologías

- Java 21
- Spring Boot (parent 4.0.6)
- Spring Data JPA
- H2 (consola disponible)
- Maven (wrapper incluido)

Estructura principal

- [pom.xml](pom.xml): dependencias y build.
- [src/main/java/com/programacionIV/trabajos_api_3/TrabajosApi3Application.java](src/main/java/com/programacionIV/trabajos_api_3/TrabajosApi3Application.java): clase principal Spring Boot.
- [src/main/java/com/programacionIV/trabajos_api_3/controller/BibliotecaController.java](src/main/java/com/programacionIV/trabajos_api_3/controller/BibliotecaController.java): expone los endpoints REST.
- [src/main/java/com/programacionIV/trabajos_api_3/service/BibliotecaService.java](src/main/java/com/programacionIV/trabajos_api_3/service/BibliotecaService.java): lógica simple que delega en repositorios.
- Entidades:
  - [src/main/java/com/programacionIV/trabajos_api_3/entity/Libro.java](src/main/java/com/programacionIV/trabajos_api_3/entity/Libro.java)
  - [src/main/java/com/programacionIV/trabajos_api_3/entity/Usuario.java](src/main/java/com/programacionIV/trabajos_api_3/entity/Usuario.java)
  - [src/main/java/com/programacionIV/trabajos_api_3/entity/Prestamo.java](src/main/java/com/programacionIV/trabajos_api_3/entity/Prestamo.java)
- Repositorios (Spring Data JPA):
  - [src/main/java/com/programacionIV/trabajos_api_3/repository/LibroRepository.java](src/main/java/com/programacionIV/trabajos_api_3/repository/LibroRepository.java)
  - [src/main/java/com/programacionIV/trabajos_api_3/repository/UsuarioRepository.java](src/main/java/com/programacionIV/trabajos_api_3/repository/UsuarioRepository.java)
  - [src/main/java/com/programacionIV/trabajos_api_3/repository/PrestamoRepository.java](src/main/java/com/programacionIV/trabajos_api_3/repository/PrestamoRepository.java)
- Recursos:
  - [src/main/resources/application.properties](src/main/resources/application.properties)
  - [src/main/resources/script.sql](src/main/resources/script.sql)
- Tests: [src/test/java/com/programacionIV/trabajos_api_3/TrabajosApi3ApplicationTests.java](src/test/java/com/programacionIV/trabajos_api_3/TrabajosApi3ApplicationTests.java)

Endpoints disponibles (controlador `BibliotecaController`)

- POST /biblioteca/libros — crear un `Libro` (JSON con `titulo`, `autor`, `anio`).
- GET /biblioteca/libros — listar todos los `Libro`.
- POST /biblioteca/usuarios — crear un `Usuario` (JSON con `nombre`, `email`).
- GET /biblioteca/usuarios — listar todos los `Usuario`.
- POST /biblioteca/prestamos — registrar un `Prestamo` (JSON con `fechaPrestamo`, `fechaDevolucion`, `libro` (obj o id), `usuario` (obj o id)).
- GET /biblioteca/prestamos — listar todos los `Prestamo`.

Modelo de datos

- `Libro`: `id`, `titulo`, `autor`, `anio`.
- `Usuario`: `id`, `nombre`, `email` (único).
- `Prestamo`: `id`, `fechaPrestamo`, `fechaDevolucion`, relación `@ManyToOne` a `Libro` y `Usuario`.

Base de datos

- El proyecto incluye dependencia H2 y la consola H2.
- Hay un script SQL (`src/main/resources/script.sql`) que crea tablas `libro`, `usuario`, `prestamo` (estilo SQL estándar con CREATE DATABASE / USE). En ejecución por defecto Spring Boot usará H2 en memoria si no se configura otra cosa en `application.properties`.

Ejecución local

En Windows (desde la raíz del proyecto):

```bash
mvnw.cmd spring-boot:run
```

o con Maven instalado:

```bash
mvn spring-boot:run
```

Pruebas

- Contiene un test de contexto básico en `TrabajosApi3ApplicationTests`.

Observaciones y mejoras sugeridas

- `application.properties` solo define el nombre de la aplicación; se puede añadir configuración explícita para H2 o para conexión a MySQL/Postgres si se desea persistencia externa.
- `script.sql` asume creación de base de datos; si se usa H2 en memoria puede que no sea necesario, o requerir adaptación.
- Validaciones de entrada y manejo de errores no están presentes (por ejemplo, duplicados, fechas inválidas).
- Considerar DTOs para las operaciones de `Prestamo` y endpoints que acepten solo IDs en lugar de objetos completos.

Siguientes pasos (opcionales)

- Añadir un `README.md` (ya creado) y ejemplos de requests cURL.
- Añadir validaciones y control de errores.
- Configurar `application.properties` para perfiles (dev/test/prod) y persistencia externa.

---

Archivo creado: README.md
