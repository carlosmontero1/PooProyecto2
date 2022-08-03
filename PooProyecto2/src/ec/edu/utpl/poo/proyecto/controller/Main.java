package ec.edu.utpl.poo.proyecto.controller;

import ec.edu.utpl.poo.proyecto.model.CalcularCosto1Docente;
import ec.edu.utpl.poo.proyecto.model.CalcularCosto2CursoRecurso;
import ec.edu.utpl.poo.proyecto.model.CalcularCosto3Ambas;
import ec.edu.utpl.poo.proyecto.model.CalcularCosto4;
import ec.edu.utpl.poo.proyecto.model.Docente;
import ec.edu.utpl.poo.proyecto.model.Fisico;
import ec.edu.utpl.poo.proyecto.model.Matricula;
import ec.edu.utpl.poo.proyecto.model.Presencial;
import ec.edu.utpl.poo.proyecto.model.TITULOS;

/**
 * <p>En la clase Main, creamos una Matricula enviandole como parametro los datos que requiere, ademas de un curso Presencial
 * o un curso Online.</p>
 * <p>Se le agrega un docente enviandolo como parametro, y se le agrega recursos tipo Fisico o Virtual a la lista de Recursos
 * de la Matricula.</p>
 * <p>Dependiendo de la forma que el usuario desea calcular el costo total, se crean objetos de la clase calcular costo que
 * desea y se lo envia como parametro al metodo calcularCosto() de la clase Matricula.</p>
 * @author Carlos Montero
 * @version 1.0
 * @since 2022-07-26
 */

public class Main {
    /**
     * Constructor por default.
     */
    public Main() {
    }

    /**
     * Ejecutor de nuestro programa.
     * @param args Contiene los argumentos de la línea de comandos proporcionados como una matriz de objetos String.
     */
    public static void main(String[] args) {

        Presencial presencial1 = new Presencial(1.0, 30, 1000.0, "Lunes", "H");
        Matricula matricula1 = new Matricula(1, 20.0, presencial1);
        Docente docente1 = new Docente(TITULOS.MAGISTER, 500.0);
        matricula1.getCurso().setDocente(docente1);
        Fisico fisico1 = new Fisico(10.0, "adbiashdb");
        Fisico fisico2 = new Fisico(25.0, "ailsydgal");
        matricula1.getCurso().addRecursos(fisico1);
        matricula1.getCurso().addRecursos(fisico2);

        CalcularCosto4 cC4 = new CalcularCosto4();
        double totalFactura = matricula1.calcularCosto(cC4);
        System.out.println("\nCosto normal:\n\t" + totalFactura);

        CalcularCosto1Docente cC1 = new CalcularCosto1Docente();
        totalFactura = matricula1.calcularCosto(cC1);
        System.out.println("\nCosto titulo de Docente:\n\t" + totalFactura);

        CalcularCosto2CursoRecurso cC2 = new CalcularCosto2CursoRecurso();
        totalFactura = matricula1.calcularCosto(cC2);
        System.out.println("\nCosto tipo de Curso y tipo de Recurso:\n\t" + totalFactura);

        CalcularCosto3Ambas cC3 = new CalcularCosto3Ambas();
        totalFactura = matricula1.calcularCosto(cC3);
        System.out.println("\nCosto titulo de Docente + tipo de Curso y tipo de Recurso:\n\t" + totalFactura);

    }
}
