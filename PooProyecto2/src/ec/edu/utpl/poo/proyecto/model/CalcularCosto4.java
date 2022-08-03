package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>La clase CalcularCosto4 implementa el interfaz ICalcularCosto. (implements ICalcularCosto).</p>
 * <p>Esta clase es el calculo normal de la matricula.</p>
 * <p>Para calcular el costo total se utiliza:</p>
 * <p>-costo base del curso</p>
 * <p>-costo de recursos</p>
 * <p>-sueldo del docente</p>
 * <p>-descuento.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class CalcularCosto4 implements ICalcularCosto {
    /**
     * Constructor por default.
     */
    public CalcularCosto4() {
    }

    /**
     * Se hace una sobreescritura del metodo calcularCosto() del interfaz con Override.
     * @param matricula Se utiliza una Matricula como parametro el cual da la informacion necesaria para calcular el costo total.
     * @return retorna el costo total de la matricula.
     */
    public double calcularCosto(Matricula matricula) {
        double total = matricula.getCurso().getCostoBase() + matricula.getCurso().getDocente().getSueldo();
        double descuento = matricula.getDescuento() * 0.01;

        for (var recurso: matricula.getCurso().getRecursos()) {
            total += recurso.getCosto();
        }

        descuento = descuento * total;
        total -= descuento;

        return total;

    }

}
