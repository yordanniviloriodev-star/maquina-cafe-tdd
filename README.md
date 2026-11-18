# ☕ Máquina de Café — TDD + CI/CD

![CI Pipeline](https://github.com/yordanniviloriodev-star/maquina-cafe-tdd/actions/workflows/ci-pipeline.yml/badge.svg)

Proyecto de **Introducción a la Ingeniería de Software (TDS-303)** — ITLA, período 2026-C-3.
Profesora: Eduandy Isabel Cruz Abreu · Estudiante: Yordanni Vilorio Jiminian (2019-7711).

Máquina dispensadora de café construida con **Test Driven Development** (Red → Green → Refactor)
y un flujo básico de **CI/CD con GitHub Actions**.

## Historia de usuario
- **Como** consumidor de café, **deseo** tomar un vaso de café **para** mitigar el sueño.
- Podré seleccionar entre 3 tamaños de vaso (Pequeño 3 Oz, Mediano 5 Oz, Grande 7 Oz).
- Podré seleccionar la cantidad de azúcar.
- Se muestra un mensaje si no hay vasos, azúcar o café.

## Estructura
~~~
src/main/java/maquinadecafe/   Vaso, Cafetera, Azucarero, MaquinaDeCafe, Main
src/test/java/maquinadecafe/   TestVaso, TestCafetera, TestAzuquero, TestMaquinaDeCafe (19 pruebas JUnit 4)
.github/workflows/ci-pipeline.yml   Pipeline de CI en GitHub Actions
~~~

## Cómo ejecutar
Requiere Java 17+ y Maven.
~~~bash
mvn test        # corre las 19 pruebas
mvn exec:java   # abre la máquina en consola
~~~

## Flujo de ramas
- `main` → versión estable.
- `develop` → integración del desarrollo.
- `feature/nueva-funcionalidad` → cambios nuevos; se integran a `develop` mediante Pull Request.

## CI/CD
El workflow `CI Pipeline` se ejecuta automáticamente en cada `push` y `pull_request`:
clona el repositorio, configura el entorno y compila el proyecto.
