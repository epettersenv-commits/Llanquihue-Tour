package cl.agencia.turismo.model;

/**
 * Cliente de la agencia. Hereda de Persona
 *
 * @author Elizabeth Pettersen
 */
public class Cliente extends Persona {
    private String nacionalidad;
    private String tipoTour;

    /**
     * Crea un cliente
     *
     * @param rut          rut del cliente
     * @param nombre       nombre del cliente
     * @param apellido     apellido del cliente
     * @param telefono     teléfono del cliente
     * @param email        email del cliente
     * @param direccion    dirección del cliente
     * @param nacionalidad nacionalidad del cliente (no puede estar vacía)
     * @param tipoTour     tipo de tour de interés (no puede estar vacío)
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Cliente(String rut, String nombre, String apellido, String telefono, String email, Direccion direccion, String nacionalidad, String tipoTour) {
        super(rut, nombre, apellido, telefono, email, direccion);
        setNacionalidad(nacionalidad);
        setTipoTour(tipoTour);
    }

    /**
     * @return la nacionalidad
     */
    public String getNacionalidad() {
        return nacionalidad;
    }

    /**
     * @param nacionalidad nueva nacionalidad (no puede ser nula ni vacía)
     * @throws IllegalArgumentException si la nacionalidad es nula o vacía
     */
    public void setNacionalidad(String nacionalidad) {
        if (nacionalidad == null || nacionalidad.isBlank()) {
            throw new IllegalArgumentException("La nacionalidad no puede estar vacía");
        }
        this.nacionalidad = nacionalidad.trim();
    }

    /**
     * @return el tipo de tour
     */
    public String getTipoTour() {
        return tipoTour;
    }

    /**
     * @param tipoTour nuevo tipo de tour (no puede ser nulo ni vacío)
     * @throws IllegalArgumentException si el tipo de tour es nulo o vacío
     */
    public void setTipoTour(String tipoTour) {
        if (tipoTour == null || tipoTour.isBlank()) {
            throw new IllegalArgumentException("El tipo de tour no puede estar vacío");
        }
        this.tipoTour = tipoTour.trim();
    }

    /**
     * @return los datos del cliente, incluyendo los de Persona
     */
    @Override
    public String toString() {
        return "---- CLIENTE ----" + super.toString() +
                "\nNacionalidad: " + nacionalidad +
                "\nTipo de Tour: " + tipoTour;
    }
}
