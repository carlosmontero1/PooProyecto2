package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>La clase Virtual es una clase hija de Recurso, por eso esta clase extends Recurso.</p>
 * <p>Ademas de las atributos de la clase padre, la clase Virtual tiene una variable privada de tipo String llamada <b>url</b>.</p>
 * <p>Llama al constructor del padre.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class Virtual extends Recurso {
    /**
     * Variable privada de tipo String para guardar el url del Recurso.
     */
    private String url;

    /**
     * Debido a que Virtual es una clase hija de Recurso, se llama al constructor de la clase padre utilizando super.
     * @param costo Asigna el parametro de costo a la variable costo para guardar el costo del Recurso Virtual.
     * @param url Asigna el parametro de url a la variable url para guardar el url del Recurso Virtual.
     */
    public Virtual(double costo, String url) {
        super(costo);
        this.url = url;
    }

}
