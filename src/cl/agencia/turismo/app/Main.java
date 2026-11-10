package cl.agencia.turismo.app;

import cl.agencia.turismo.model.*;

/**
 * Clase principal. Crea objetos válidos y muestra sus datos por consola
 *
 * @author Elizabeth Pettersen
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("::::::: Llanquihue Tour - Prototipo de personas :::::::\n");

        //Creación de objetos válidos
        try {
            Direccion direccion1 = new Direccion("Av. Ramón Freire", 120, "Llanquihue", "Los Lagos");
            Direccion direccion2 = new Direccion("Calle Errázuriz", 455, "Puerto Varas", "Los Lagos");
            Direccion direccion3 = new Direccion("Av. Vicente Perez Rosales", 80, "Frutillar", "Los Lagos");

            //Crea un empleado
            Empleado empleado = new Empleado("12.345.678-9", "María", "Soto", "+569 1234 5678",
                    "maria.soto@llanquihuetour.cl", direccion1, "Coordinadora de Tours", 850000);

            //Crea un guía turístico
            GuiaTuristico guiaTuristico = new GuiaTuristico("13.456.789-0", "Pedro", "Alvarado",
                    "+569 1234 5678", "pedro.alvarado@llanquihuetour.cl", direccion2,
                    "Español / Inglés", "Paseos Lacustres");

            //Crea un cliente
            Cliente cliente = new Cliente("21.654.321-k", "Laura", "Becker", "+569 5555 1234",
                    "laura.becker@gmail.com", direccion3, "Alemana", "Ruta Gastronómica");

            System.out.println(empleado + "\n");
            System.out.println(guiaTuristico + "\n");
            System.out.println(cliente + "\n");

            //Demostración de setters
            cliente.setTipoTour("Excursión Cultural");
            cliente.getDireccion().setComuna("Puerto Montt");
            System.out.println("Tras actualizar los datos con setters: ");
            System.out.println(cliente);
        } catch (IllegalArgumentException e){
            System.out.println("Error al crear los objetos: " + e.getMessage());
        }
    }
}
