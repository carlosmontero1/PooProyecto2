package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>Dentro de la clase Recurso se define 1 variable que se utilizara con el modificador de acceso private.</p>
 * <p>Con esta clase crearemos un Recurso y se guardara su costo.</p>
 * <p>Cuenta con un constructor y metodo Getter.</p>
 * <p>Creamos una variable privada de tipo double llamada <b>costo</b> para guardar el costo del Recurso.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class Recurso {
    /**
     * Variable privada de tipo double para guardar el costo del Recurso.
     */
    private double costo;

    /**
     * El constructor de Recurso tiene como parametro la variable de clase: costo.
     * @param costo Asignamos el parametro costo a la variable costo de clase para guardar el costo del Recurso.
     */
    public Recurso(double costo) {
        this.costo = costo;
    }

    /**
     * El metodo getCosto() sirve para retornar el costo del Recurso.
     * @return retorna el costo del Recurso.
     */
    public double getCosto() {
        return this.costo;
    }

}
