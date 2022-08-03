package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>La clase Presencial es una clase hija de Curso, por eso esta clase extends Curso.</p>
 * <p>Ademas de las atributos de la clase padre, la clase Presencial tiene una variable privada de tipo String llamada <b>aula</b>
 * para guardar el aula del Curso si es Presencial.</p>
 * <p>Llama al constructor del padre.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class Presencial extends Curso {
    /**
     * Variable privada de tipo String para guardar el aula del Curso.
     */
    private String aula;

    /**
     * Debido a que Presencial es una clase hija de Curso, se llama al constructor de la clase padre utilizando super.
     * @param nombre Asigna el parametro de nombre a la variable nombre para guardar el nombre del Curso Presencial.
     * @param numHoras Asigna el parametro de numHoras a la variable numHoras para guardar el numero de horas del Curso Presencial.
     * @param costoBase Asigna el parametro de costoBase a la variable costoBase para guardar el costo base del Curso Presencial.
     * @param horario Asigna el parametro de horario a la variable horario para guardar el horario del Curso Presencial.
     * @param aula Asigna el parametro de aula a la variable aula para guardar el aula del Curso Presencial.
     */
    public Presencial(double nombre, int numHoras, double costoBase, String horario, String aula) {
        super(nombre, numHoras, costoBase, horario);
        this.aula = aula;
    }

}
