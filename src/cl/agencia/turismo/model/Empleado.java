package cl.agencia.turismo.model;

/**
 * Empleado de la agencia. Hereda de Persona y agrega cargo y sueldo base.
 *
 * @author Elizabeth Pettersen
 */
public class Empleado extends Persona {
    private String cargo;
    private int sueldoBase;

    /**
     * Crea un empleado. Los datos comunes se envían a Persona con super.
     *
     * @param rut        rut del empleado
     * @param nombre     nombre del empleado
     * @param apellido   apellido del empleado
     * @param telefono   teléfono del empleado
     * @param email      email del empleado
     * @param direccion  dirección del empleado
     * @param cargo      cargo en la agencia (no puede estar vacío)
     * @param sueldoBase sueldo base (no puede ser negativo)
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Empleado(String rut, String nombre, String apellido, String telefono, String email, Direccion direccion, String cargo, int sueldoBase) {
        super(rut, nombre, apellido, telefono, email, direccion);
        setCargo(cargo);
        setSueldoBase(sueldoBase);
    }

    /**
     * @return el cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo nuevo cargo (no puede ser nulo ni vacío)
     * @throws IllegalArgumentException si el cargo es nulo o vacío
     */
    public void setCargo(String cargo) {
        if (cargo == null || cargo.isBlank()) {
            throw new IllegalArgumentException("El cargo no puede estar vacío");
        }
        this.cargo = cargo.trim();
    }

    /**
     * @return el sueldo base
     */
    public int getSueldoBase() {
        return sueldoBase;
    }

    /**
     * @param sueldoBase nuevo sueldo base (no puede ser negativo)
     * @throws IllegalArgumentException si el sueldo es negativo
     */
    public void setSueldoBase(int sueldoBase) {
        if (sueldoBase < 0) {
            throw new IllegalArgumentException("El sueldo base no puede ser negativo");
        }
        this.sueldoBase = sueldoBase;
    }

    /**
     * @return los datos del empleado, incluyendo los de Persona
     */
    @Override
    public String toString() {
        return "---- EMPLEADO ----" + super.toString() +
                "\nCargo: " + cargo +
                "\nSueldo Base: " + sueldoBase;
    }
}
