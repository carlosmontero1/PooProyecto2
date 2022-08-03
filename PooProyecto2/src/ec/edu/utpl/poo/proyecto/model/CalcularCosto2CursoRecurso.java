package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>La clase CalcularCosto2CursoRecurso implementa el interfaz ICalcularCosto. (implements ICalcularCosto).</p>
 * <p>Para calcular el costo total se utiliza:</p>
 * <p>-costo base del curso: si es presencial el costo del curso aumenta en 5% y si es en linea se descuenta el 5%</p>
 * <p>-costo de recursos: si el recurso es fisico aumenta el costo 10% y si es virtual se descuenta el 3%</p>
 * <p>-sueldo del docente</p>
 * <p>-descuento.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class CalcularCosto2CursoRecurso implements ICalcularCosto {
    /**
     * Constructor por default.
     */
    public CalcularCosto2CursoRecurso() {
    }

    /**
     * Se hace una sobreescritura del metodo calcularCosto() del interfaz con Override.
     * @param matricula Se utiliza una Matricula como parametro el cual da la informacion necesaria para calcular el costo total.
     * @return retorna el costo total de la matricula.
     */
    public double calcularCosto(Matricula matricula) {

        double total = 0;
        double costoBase = matricula.getCurso().getCostoBase();
        double recursoCosto = 0;
        double descuento = matricula.getDescuento() * 0.01;

        if (matricula.getCurso() instanceof Presencial) {
            costoBase = costoBase + (costoBase * 0.05);
        } else if (matricula.getCurso() instanceof Online) {
            costoBase = costoBase - (costoBase * 0.05);
        }

        total += costoBase;

        for (var recurso: matricula.getCurso().getRecursos()) {
            if (recurso instanceof Fisico) {
                recursoCosto = recurso.getCosto() + (recurso.getCosto() * 0.1);
            } else if (recurso instanceof Virtual) {
                recursoCosto = recurso.getCosto() - (recurso.getCosto() * 0.03);
            }
            total += recursoCosto;
        }

        total += matricula.getCurso().getDocente().getSueldo();

        descuento = descuento * total;
        total -= descuento;

        return total;

    }

}
