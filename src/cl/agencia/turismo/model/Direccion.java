package cl.agencia.turismo.model;

/**
 * Representa una dirección física.
 * Se usa por composición dentro de Persona: una persona "tiene una" dirección.
 *
 * @author Elizabeth Pettersen
 */
public class Direccion {
    private String calle;
    private int numero;
    private String comuna;
    private String region;

    /**
     * Crea una dirección validando cada dato.
     *
     * @param calle  nombre de la calle (no puede estar vacío)
     * @param numero numero de la dirección (debe ser mayor que 0)
     * @param comuna comuna (no puede estar vacía)
     * @param region región (no puede estar vacía)
     * @throws IllegalArgumentException si algún dato no es válido
     */
    public Direccion(String calle, int numero, String comuna, String region) {
        setCalle(calle);
        setNumero(numero);
        setComuna(comuna);
        setRegion(region);
    }

    /**
     * @return la calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle nueva calle (no puede estar vacía)
     * @throws IllegalArgumentException si la calle es nula o vacía
     */
    public void setCalle(String calle) {
        if (calle == null || calle.isBlank()) {
            throw new IllegalArgumentException("La calle no puede estar vacía");
        }
        this.calle = calle.trim();
    }

    /**
     * @return el número de la dirección
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero nuevo número (no puede ser menor o igual a cero)
     * @throws IllegalArgumentException si el número es menor o igual a cero
     */
    public void setNumero(int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de la dirección debe ser mayor a cero");
        }
        this.numero = numero;
    }

    /**
     * @return la comuna
     */
    public String getComuna() {
        return comuna;
    }

    /**
     * @param comuna nueva comuna (no puede ser nula ni vacía)
     * @throws IllegalArgumentException si la comuna es nula o vacía
     */
    public void setComuna(String comuna) {
        if (comuna == null || comuna.isBlank()) {
            throw new IllegalArgumentException("La comuna no puede estar vacía");
        }
        this.comuna = comuna.trim();
    }

    /**
     * @return la región
     */
    public String getRegion() {
        return region;
    }

    /**
     * @param region nueva región (no puede ser nula ni vacía)
     * @throws IllegalArgumentException si la región es nula o vacía
     */
    public void setRegion(String region) {
        if (region == null || region.isBlank()) {
            throw new IllegalArgumentException("La región no puede estar vacía");
        }
        this.region = region.trim();
    }

    /**
     * @return los datos de la dirección en texto legible
     */
    @Override
    public String toString() {
        return
                "\nCalle: " + calle +
                        "\nNúmero: " + numero +
                        "\nComuna: " + comuna +
                        "\nRegión: " + region;
    }
}
