package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>Interfaz que contiene los metodos que seran implementados por las clases hijas.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public interface ICalcularCosto {

    /**
     * Este metodo calcula el costo de la matricula, la cual sera el parametro.
     * @param var1 Se utiliza una Matricula como parametro el cual da la informacion necesaria para calcular el costo total.
     * @return retorna el costo total de la matricula.
     */
    double calcularCosto(Matricula var1);

}
