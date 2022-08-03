package ec.edu.utpl.poo.proyecto.model;

/**
 * La clase Fisico es una clase hija de Recurso, por eso esta clase extends Recurso.
 * Ademas de las atributos de la clase padre, la clase Fisico tiene una variable privada de tipo String llamada isbn.
 * Llama al constructor del padre.
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class Fisico extends Recurso {
    /**
     * Variable privada de tipo String para guardar el isbn del Recurso.
     */
    private String isbn;

    /**
     * Debido a que Fisico es una clase hija de Recurso, se llama al constructor de la clase padre utilizando super.
     * @param costo Asigna el parametro de costo a la variable costo para guardar el costo del Recurso Fisico.
     * @param isbn Asigna el parametro de isbn a la variable isbn para guardar el isbn del Recurso Fisico.
     */
    public Fisico(double costo, String isbn) {
        super(costo);
        this.isbn = isbn;
    }

}
