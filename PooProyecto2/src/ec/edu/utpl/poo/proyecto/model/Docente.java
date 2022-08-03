package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>Dentro de la clase Docente se definen 2 variables que se utilizaran con el modificador de acceso private.</p>
 * <p>Con esta clase crearemos un Docente y se guardara informacion sobre el como su titulo y sueldo.</p>
 * <p>Cuenta con un constructor y metodos Getters.</p>
 * <p>Creamos una variable privada de tipo TITULOS llamada <b>titulo</b> para guardar el titulo del Docente.</p>
 * <p>Creamos una variable privada de tipo double llamada <b>sueldo</b> para guardar el sueldo del Docente.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class Docente {
    /**
     * Variable privada de tipo TITULOS para guardar el titulo del Docente.
     */
    private TITULOS titulo;
    /**
     * Variable privada de tipo double para guardar el sueldo del Docente.
     */
    private double sueldo;

    /**
     * El constructor de Matricula tiene como parametros las dos variables de clase: titulo y sueldo.
     * @param titulo Asignamos el parametro titulo a la variable titulo de clase para guardar el titulo del Docente.
     * @param sueldo Asignamos el parametro sueldo a la variable sueldo de clase para guardar el sueldo del Docente.
     */
    public Docente(TITULOS titulo, double sueldo) {
        this.titulo = titulo;
        this.sueldo = sueldo;
    }

    /**
     * El metodo getTitulo() sirve para retornar el titulo del Docente.
     * @return retorna el titulo del Docente.
     */
    public TITULOS getTitulo() {
        return this.titulo;
    }

    /**
     * El metodo getSueldo() sirve para retornar el sueldo del Docente.
     * @return retorna el sueldo del Docente.
     */
    public double getSueldo() {
        return this.sueldo;
    }

}
