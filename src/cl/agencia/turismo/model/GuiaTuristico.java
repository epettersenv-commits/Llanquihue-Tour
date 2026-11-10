package cl.agencia.turismo.model;

/**
 * Guía turístico colaborador de la agencia. Hereda de Persona.
 *
 * @author Elizabeth Pettersen
 */
public class GuiaTuristico extends Persona {
    private String idioma;
    private String especialidad;

    /**
     * Crea un guía turístico
     *
     * @param rut          rut del guía
     * @param nombre       nombre del guía
     * @param apellido     apellido del guía
     * @param telefono     teléfono del guía
     * @param email        email del guía
     * @param direccion    dirección del guía
     * @param idioma       idioma que maneja (no puede estar vacío)
     * @param especialidad especialidad del guía (no puede estar vacía)
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public GuiaTuristico(String rut, String nombre, String apellido, String telefono, String email, Direccion direccion, String idioma, String especialidad) {
        super(rut, nombre, apellido, telefono, email, direccion);
        setIdioma(idioma);
        setEspecialidad(especialidad);
    }

    /**
     * @return los idiomas
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma nuevos idiomas (no pueden ser nulos ni vacíos)
     * @throws IllegalArgumentException si el idioma es nulo o vacío
     */
    public void setIdioma(String idioma) {
        if (idioma == null || idioma.isBlank()) {
            throw new IllegalArgumentException("El idioma no puede estar vacío");
        }
        this.idioma = idioma.trim();
    }

    /**
     * @return la especialidad
     */
    public String getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad nueva especialidad (no puede ser nula ni vacía)
     * @throws IllegalArgumentException si la especialidad es nula o vacía
     */
    public void setEspecialidad(String especialidad) {
        if (especialidad == null || especialidad.isBlank()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía");
        }
        this.especialidad = especialidad.trim();
    }

    /**
     * @return los datos del guía, incluyendo los de Persona
     */
    @Override
    public String toString() {
        return "---- GUÍA TURÍSTICO ----" + super.toString() +
                "\nIdioma: " + idioma +
                "\nEspecialidad: " + especialidad;
    }
}
