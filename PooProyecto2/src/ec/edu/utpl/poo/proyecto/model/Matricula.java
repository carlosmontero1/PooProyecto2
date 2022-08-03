package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>Dentro de la clase Matricula se definen 3 variables que se utilizaran con el modificador de acceso private.</p>
 * <p>Con esta clase crearemos una Matricula y se guardara informacion sobre ella como su numero, descuento y curso.</p>
 * <p>Cuenta con un constructor, metodo para calcular el costo de la matricula, metodos Getters y un validator para el descuento.</p>
 * <p>Creamos una variable privada de tipo int llamada <b>numero</b> para guardar el numero de Matricula.</p>
 * <p>Creamos una variable privada de tipo double llamada <b>descuento</b> para guardar el porcentaje de descuento de la Matricula.</p>
 * <p>Creamos una variable privada de tipo Curso llamada <b>curso</b> para guardar el curso de la Matricula.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */

public class Matricula {
    /**
     * Variable privada de tipo int para guardar el numero de Matricula.
     */
    private int numero;
    /**
     * Variable privada de tipo double para guardar el porcentaje de descuento de la Matricula.
     */
    private double descuento;
    /**
     * Variable privada de tipo Curso para guardar el curso de la Matricula.
     */
    private Curso curso;

    /**
     * El constructor de Matricula tiene como parametros las tres variables de clase: numero, descuento y curso.
     * @param numero Asignamos el parametro numero a la variable numero de clase para guardar el numero de Matricula.
     * @param descuento Asignamos el parametro descuento a la variable clase para guardar el porcentaje de descuento,
     *                  solo si despues de pasar por el validator de descuento llamado validatorDescuento es considerado
     *                  un descuento valido. Si el validator nos dice que el decuento no es un valor valido, se lanzara
     *                  un IllegalArgumentException diciendo al usuario "Porcentaje de descuento no valido. Ingrese valor
     *                  entre 0 y 100 %"
     * @param curso Se asigna el parametro curso a la variable curso que guarda el Curso de la matricula si el descuento
     *              es considerado valido.
     */
    public Matricula(int numero, double descuento, Curso curso) {
        this.numero = numero;
        if (this.validatorDescuento(descuento)) {
            this.descuento = descuento;
            this.curso = curso;
        } else {
            throw new IllegalArgumentException("Porcentaje de descuento no valido. Ingrese valor entre 0 y 100 %");
        }
    }

    /**
     * Calculamos el costo de la matricula a traves del metodo calcularCosto() donde como parametro utilizamos el algoritmo que usaremos
     * @param algoritmo Para cada diferente manera de calcular un costo, creamos una clase y dependiendo de cual queramos utilizar para el calculo,
     *                  lo enviamos como parametro del metodo.
     * @return retornamos el resultado del metodo calcularCosto() al enviarle como parametro una variable de tipo Matricula.
     */
    public double calcularCosto(ICalcularCosto algoritmo) {
        return algoritmo.calcularCosto(this);
    }

    /**
     * El metodo getDecuento() sirve para retornar el valor del porcentaje de descuento de la Matricula.
     * @return retorna el porcentaje de descuento de la Matricula.
     */
    public double getDescuento() {
        return this.descuento;
    }

    /**
     * El metodo getCurso() sirve para retornar el Curso la Matricula.
     * @return retorna el curso de la Matricula.
     */
    public Curso getCurso() {
        return this.curso;
    }

    /**
     * Verificamos si el porcentaje de descuento es valido. Debido a que es un porcentaje, el valor del parametro debe ser
     * mayor o igual a 0 y menor o igual a 100. La variable valido de tipo boolean guarda la veracidad de la validez.
     * @param descuento El porcentaje de descuento de la Matricula
     * @return regresa el resultado de la variable booleana valido.
     */
    public boolean validatorDescuento(double descuento) {
        boolean valido = false;
        if (descuento >= 0.0 && descuento <= 100.0) {
            valido = true;
        } else {
            valido = false;
        }

        return valido;
    }

}
