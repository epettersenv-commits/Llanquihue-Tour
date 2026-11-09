![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Actividad Sumativa Semana 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Elizabeth Pettersen
- **Sección:** 004A
- **Carrera:** Analista Programador Computacional
- **Sede:** Campus online

---

## 📘 Descripción general del sistema
Este proyecto corresponde a la actividad sumativa de la Semana 3 de la asignatura *Desarrollo Orientado a Objetos I*. Se trata de un prototipo desarrollado en Java para la agencia de turismo **Llanquihue Tour**, cuyo objetivo es modelar a las personas vinculadas a la agencia: empleados, guías turísticos y clientes.

El sistema aplica encapsulamiento (atributos privados con getters y setters), herencia, composición, validaciones con excepciones (`throw` y `try/catch`) y documentación con JavaDoc. Busca resolver la información desorganizada y duplicada de la agencia, y sirve de base para construir el sistema completo en fases futuras.

### Relaciones entre clases
- **Herencia:** `Empleado`, `GuiaTuristico` y `Cliente` extienden (`extends`) de `Persona`.
- **Composición:** `Persona` contiene un objeto `Direccion` como atributo.
- **Validaciones:** los setters lanzan `IllegalArgumentException` cuando un dato no es válido, y `Main` las controla con `try/catch`.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/cl/agencia/turismo/
├── app/
│   └── Main.java            # Clase principal con el método main
└── model/
    ├── Persona.java         # Clase base (datos comunes y validaciones)
    ├── Direccion.java       # Composición: una Persona tiene una Direccion
    ├── Empleado.java        # Hereda de Persona (cargo, sueldo base)
    ├── GuiaTuristico.java   # Hereda de Persona (idioma, especialidad)
    └── Cliente.java         # Hereda de Persona (nacionalidad, tipo de tour)
```

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/epettersenv-commits/-Actividad-Sumativa-Semana-3-Desarrollo-Orientado-a-Objetos-I
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java` desde el paquete `cl.agencia.turismo.app` (clic derecho sobre el archivo → **Run 'Main.main()'**).

4. Revisa la salida por consola: se muestran los datos de un empleado, un guía turístico y un cliente, y luego los cambios hechos con setters.

---

**Repositorio GitHub:** [Pega aquí el enlace al repositorio]
**Fecha de entrega:** 09/11/2026]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones
