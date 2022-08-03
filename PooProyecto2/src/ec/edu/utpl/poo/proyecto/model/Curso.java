package ec.edu.utpl.poo.proyecto.model;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Dentro de la clase Curso se definen 6 variables que se utilizaran con el modificador de acceso private.</p>
 * <p>Con esta clase crearemos un Curso y se guardara informacion sobre el como su nombre, numero de horas, el costo base,
 * el horario, el docente y una lista de recursos que se utilizaran en el curso.</p>
 * <p>Cuenta con un constructor, metodo Setter para asignar el docente, metodo para agregar un recurso a la lista de recursos,
 * y metodos Getters.</p>
 * <p>Creamos una variable privada de tipo double llamada <b>nombre</b> para guardar el nombre del Curso.</p>
 * <p>Creamos una variable privada de tipo int llamada <b>numHoras</b> para guardar el numero de horas del Curso.</p>
 * <p>Creamos una variable privada de tipo double llamada <b>costoBase</b> para guardar el costo base del Curso.</p>
 * <p>Creamos una variable privada de tipo String llamada <b>horario</b> para guardar el horario del Curso.</p>
 * <p>Creamos una variable privada de tipo Docente llamada <b>docente</b> para guardar el docente del Curso.</p>
 * <p>Creamos una Array List privada que contiene elementos de tipo Recurso llamada <b>recursos</b> para guardar los recursos del Curso.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */

public class Curso {
    /**
     * Variable privada de tipo double para guardar el nombre del Curso.
     */
    private double nombre;
    /**
     * Variable privada de tipo int para guardar el numero de horas del Curso.
     */
    private int numHoras;
    /**
     *variable privada de tipo double para guardar el costo base del Curso.
     */
    private double costoBase;
    /**
     * Variable privada de tipo String para guardar el horario del Curso.
     */
    private String horario;
    /**
     * Variable privada de tipo Docente para guardar el docente del Curso.
     */
    private Docente docente;
    /**
     * Array List privada que contiene elementos de tipo Recurso para guardar los recursos del Curso.
     */
    private List<Recurso> recursos = new ArrayList();

    /**
     * El constructor de Curso tiene como parametros cuatro variables de clase: numero, descuento y curso.
     * El docente puede ser agregado a traves del metodo setDocente().
     * Los recursos pueden ser agregados a traves del metodo addRecursos().
     * @param nombre Asigna el parametro de nombre a la variable nombre para guardar el nombre del curso.
     * @param numHoras Asigna el parametro de numHoras a la variable numHoras para guardar el numero de horas del curso.
     * @param costoBase Asigna el parametro de costoBase a la variable costoBase para guardar el costo base del curso.
     * @param horario Asigna el parametro de horario a la variable horario para guardar el horario del curso.
     */
    public Curso(double nombre, int numHoras, double costoBase, String horario) {
        this.nombre = nombre;
        this.numHoras = numHoras;
        this.costoBase = costoBase;
        this.horario = horario;
    }

    /**
     * El metodo setDocente() sirve para asignar el docente del Curso.
     * @param docente Asigna el docente del Curso.
     */
    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    /**
     * El metodo addRecursos() sirve para agregar recursos a la lista de recursos del Curso.
     * @param recurso Agrega un recurso a la lista de recursos del Curso.
     */
    public void addRecursos(Recurso recurso) {
        this.recursos.add(recurso);
    }

    /**
     * El metodo getDocente() sirve para retornar el docente del Curso.
     * @return retorna el docente del Curso.
     */
    public Docente getDocente() {
        return this.docente;
    }

    /**
     * El metodo getRecursos() sirve para retornar la lista de recursos del Curso.
     * @return retorna la lista de los recursos del Curso.
     */
    public List<Recurso> getRecursos() {
        return this.recursos;
    }

    /**
     * El metodo getCostoBase() sirve para retornar el costo base del Curso.
     * @return retorna el costo base del Curso.
     */
    public double getCostoBase() {
        return this.costoBase;
    }

}
