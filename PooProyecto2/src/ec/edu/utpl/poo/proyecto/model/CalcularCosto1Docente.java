package ec.edu.utpl.poo.proyecto.model;

/**
 * <p>La clase CalcularCosto1Docente implementa el interfaz ICalcularCosto. (implements ICalcularCosto).</p>
 * <p>Para calcular el costo total se utiliza:</p>
 * <p>-costo base del curso</p>
 * <p>-costo de recursos</p>
 * <p>-sueldo del docente: se incrementa el sueldo segun el titulo del docente, 10% si es Licenciado, 12.5% si es Ingeniero,
 * 15% si es Magister y 17.5% si es PhD</p>
 * <p>-descuento.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */
public class CalcularCosto1Docente implements ICalcularCosto {
    /**
     * Constructor por default.
     */
    public CalcularCosto1Docente() {
    }

    /**
     * Se hace una sobreescritura del metodo calcularCosto() del interfaz con Override.
     * @param matricula Se utiliza una Matricula como parametro el cual da la informacion necesaria para calcular el costo total.
     * @return retorna el costo total de la matricula.
     */
    public double calcularCosto(Matricula matricula) {

        double total = matricula.getCurso().getCostoBase();
        double sueldoDocente = matricula.getCurso().getDocente().getSueldo();
        double descuento = matricula.getDescuento() * 0.01;

        for (var recurso: matricula.getCurso().getRecursos()) {
            total += recurso.getCosto();
        }

        if (matricula.getCurso().getDocente().getTitulo() == TITULOS.LICENCIADO) {
            sueldoDocente = sueldoDocente + (sueldoDocente * 0.1);
        }

        if (matricula.getCurso().getDocente().getTitulo() == TITULOS.INGENIERO) {
            sueldoDocente = sueldoDocente + (sueldoDocente * 0.125);
        }

        if (matricula.getCurso().getDocente().getTitulo() == TITULOS.MAGISTER) {
            sueldoDocente = sueldoDocente + (sueldoDocente * 0.15);
        }

        if (matricula.getCurso().getDocente().getTitulo() == TITULOS.PHD) {
            sueldoDocente = sueldoDocente + (sueldoDocente * 0.175);
        }

        total += sueldoDocente;

        descuento = descuento * total;
        total -= descuento;

        return total;

    }

}
