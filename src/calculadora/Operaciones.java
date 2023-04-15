package calculadora;

/**
 * La clase Operaciones permite realizar las operaciones basicas de una
 * calculadora(suma, resta, multiplicación, división y modulo)
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 * @version: 1.0.0 15-04-2023
 * @since: 1.0.0
 */
public class Operaciones {
    /**
     * Esta variable guarda el primer numero con el que se desea hacer X operación.
     */
    private double dato1;
    /**
     * Esta variable guarda el segundo numero con el que se desea hacer X operación
     */
    private double dato2;
    /**
     * Esta variable guarda el tipo de operación que el usuario desea calcular.
     */
    private String operacion;
    /**
     * Esta variable guarda el resultado final de la operacion realizada.
     */
    private double resultado;

    /**
     * Este es el metodo constructor, el cual pide de forma obligatoria el dato1, dato2 y la operacion, para poder
     * instanciar un objeto de tipo operaciones.
     */
    public Operaciones(double dato1, double dato2, String operacion) {
        this.dato1 = dato1;
        this.dato2 = dato2;
        this.operacion = operacion;
    }

    /**
     * Este metodo permite realizar el calculo de la operacion escojida con los numeros ingresador por el usuario:
     * Ejemplo:
     *      dato1 = 5;
     *      dat02 = 4;
     *      operacion = "multiplicacion"
     *
     *      resultado = 5 * 4
     *      resultado = 20
     *
     * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
     * @since: 1.0.0
     */
    public void operar() {
        switch (operacion) {
            case "suma":
                resultado = dato1 + dato2;
                break;
            case "resta":
                resultado = dato1 - dato2;
                break;
            case "multiplicacion":
                resultado = dato1 * dato2;
                break;
            case "division":
                resultado = dato1 / dato2;
                break;
            case "modulo":
                resultado = dato1 % dato2;
                break;

            default:
                System.out.println("operacion incorrecta");
                break;
        }

    }

    /**
     * Este metodo permite devolver el resultado de la operación calculada
     *
     * @return retorna un double  con el resultado de la operación.
     *
     * @author Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
     * @since 1.0.0
     */
    public double getResultado() {
        return resultado;
    }
}
