package cl.agencia.turismo.model;

/**
 * Clase base que representa a cualquier persona vinculada a Llanquihue Tour.
 * Contiene un objeto Direccion, composición y es extendida por Empleado,
 * GuiaTuristico y Cliente (herencia).
 *
 * @author Elizabeth Pettersen
 */
public class Persona {
    private String rut;
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private Direccion direccion;

    /**
     * Crea una persona validando cada dato.
     *
     * @param rut       rut con guión, por ejemplo, 12.345.678-9
     * @param nombre    nombre (no puede estar vacío)
     * @param apellido  apellido (no puede estar vacío)
     * @param telefono  teléfono (al menos con 8 caracteres)
     * @param email     correo que contenga "@" y "."
     * @param direccion dirección de la persona (no puede ser nula)
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Persona(String rut, String nombre, String apellido, String telefono, String email, Direccion direccion) {
        setRut(rut);
        setNombre(nombre);
        setApellido(apellido);
        setTelefono(telefono);
        setEmail(email);
        setDireccion(direccion);
    }

    /**
     * @return el rut
     */
    public String getRut() {
        return rut;
    }

    /**
     * @param rut rut con guión, por ejemplo 12.345.678-9 (entre 9 y 12 caracteres)
     * @throws IllegalArgumentException si el rut es nulo, no tiene guión o tiene un largo inválido
     */
    public void setRut(String rut) {
        if (rut == null || !rut.contains("-") || rut.trim().length() < 9 || rut.trim().length() > 12) {
            throw new IllegalArgumentException("Rut inválido. Formato esperado: 12.345.678-9");
        }
        this.rut = rut.trim();
    }

    /**
     * @return el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre nuevo nombre (no puede ser nulo ni vacío)
     * @throws IllegalArgumentException si el nombre es nulo o vacío
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    /**
     * @return el apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido nuevo apellido (no puede ser nulo ni vacío)
     * @throws IllegalArgumentException si el apellido es nulo o vacío
     */
    public void setApellido(String apellido) {
        if (apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        this.apellido = apellido.trim();
    }

    /**
     * @return el teléfono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono teléfono con al menos 8 caracteres
     * @throws IllegalArgumentException si el teléfono es nulo o muy corto
     */
    public void setTelefono(String telefono) {
        if (telefono == null || telefono.trim().length() < 8) {
            throw new IllegalArgumentException("Teléfono inválido. Ejemplo: +569 1234 5678");
        }
        this.telefono = telefono.trim();
    }

    /**
     * @return el correo electrónico
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email correo con un solo "@", texto antes del "@" y un "." después del "@"
     * @throws IllegalArgumentException si el correo no cumple ese formato
     */
    public void setEmail(String email) {
        if (email == null) {
            throw new IllegalArgumentException("El email no puede ser nulo");
        }
        email = email.trim();
        int arroba = email.indexOf("@");
        boolean unSoloArroba = arroba != -1 && arroba == email.lastIndexOf("@");
        boolean textoAntes = arroba > 0;
        boolean puntoDespues = email.indexOf(".", arroba + 2) != -1 && !email.endsWith(".");

        if (!unSoloArroba || !textoAntes || !puntoDespues) {
            throw new IllegalArgumentException("Email inválido. Ejemplo: nombre@correo.cl");
        }
        this.email = email;
    }

    /**
     * @return la dirección de la persona
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * @param direccion nueva dirección (no puede ser nula)
     * @throws IllegalArgumentException si la dirección es nula
     */
    public void setDireccion(Direccion direccion) {
        if (direccion == null) {
            throw new IllegalArgumentException("La dirección no puede ser nula");
        }
        this.direccion = direccion;
    }

    /**
     * @return los datos de la persona en texto legible
     */
    @Override
    public String toString() {
        return
                "\nRut: " + rut +
                        "\nNombre: " + nombre +
                        "\nApellido: " + apellido +
                        "\nTeléfono: " + telefono +
                        "\nEmail: " + email + "\n" +
                        "\nDirección: " + direccion;
    }
}



