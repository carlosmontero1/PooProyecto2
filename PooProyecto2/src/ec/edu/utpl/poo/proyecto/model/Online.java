package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>La clase Online es una clase hija de Curso, por eso esta clase extends Curso.</p>
 * <p>Ademas de las atributos de la clase padre, la clase Online tiene una variable privada de tipo String llamada <b>salaID</b>
 * para guardar la ID de la sala del Curso si es Online.</p>
 * <p>Llama al constructor del padre.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class Online extends Curso {
    /**
     * Variable privada de tipo String para guardar la ID de la sala del Curso.
     */
    private String salaID;

    /**
     * Debido a que Online es una clase hija de Curso, se llama al constructor de la clase padre utilizando super.
     * @param nombre Asigna el parametro de nombre a la variable nombre para guardar el nombre del Curso Online.
     * @param numHoras Asigna el parametro de numHoras a la variable numHoras para guardar el numero de horas del Curso Online.
     * @param costoBase Asigna el parametro de costoBase a la variable costoBase para guardar el costo base del Curso Online.
     * @param horario Asigna el parametro de horario a la variable horario para guardar el horario del Curso Online.
     * @param salaID Asigna el parametro de salaID a la variable salaID para guardar la ID del aula del Curso Online.
     */
    public Online(double nombre, int numHoras, double costoBase, String horario, String salaID) {
        super(nombre, numHoras, costoBase, horario);
        this.salaID = salaID;
    }

}
