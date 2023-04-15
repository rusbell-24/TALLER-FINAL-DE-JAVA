package calculadora;

import java.util.Scanner;

/**
 * En la clase Main se contruye toda la interfaz con la que el usuario va a interactuar
 * con la biblioteca y el reproductor de musica, tambien se contruye aqui la parte trasera
 * del sistema donde se indica que accion se tomara cuando el usuario solicite una determinada
 * funcion.
 *
 * @version 1.00.000 15-04-2023
 *
 * @author: Rusbell Ruiz Portocarrero - rusbell.ruiz.p@gmail.com
 *
 * @since 1
 */
public class Main {

    /**
     * Esta variable funcionaran de forma global y guardan los numeros ingresados por
     * el usuario para realizar la operacion matematica.
     */
    public static double dato1, dato2;

    /**
     * Este se encarga de inprimir el menu principal de la calculadora.
     */
    public static void menuPrincipal(){
        System.out.println("");
        System.out.println("_________Calculadora_______");
        System.out.println("");
        System.out.println("      1. Sumar");
        System.out.println("      2. Restar");
        System.out.println("      3. Multiplicar");
        System.out.println("      4. Dividir");
        System.out.println("      5. Modulo");
        System.out.println("      6. Salir del sistema");
        System.out.println("------------------------------");
        System.out.print(" Ingrese su opcion: ");
    }

    /**
     * Este metodo se encarga de solicitar y guardar los dos valores con los cuales se desea calcular laoperacion
     */
    public static void pedirDatos(String operacion){
        Scanner input = new Scanner(System.in);
        System.out.print("\n\nIngrese el primer numero( " + operacion + "):");
        dato1 = input.nextDouble();
        System.out.print("Ingrese el segundo numero( " + operacion + "):");
        dato2 = input.nextDouble();
    }


    public static void main(String[] args) {

        String suma = "suma";
        String resta = "resta";
        String multiplicacion = "multiplicacion";
        String division = "division";
        String modulo = "modulo";

        int opcion;

        Scanner input = new Scanner(System.in);

        /**
         * Se utiliza un Do para crear el ciclo de interfaz grafica para el Usuario.
         */
        do {
            /**
             * Se muestra el menu principal alusuario.
             * Se captura la opcion ingresada por el usuario en la variable "opcion"
             */
            menuPrincipal();
            opcion = input.nextInt();

            /**
             * Se utiliza un switch case para evaluar que accion solicito el Usuario.
             * Las acciones establecidas aqui permitiran solicitar los numeros para la
             * operacion seleccionada por el usuario e instanciar de forma adecuada el objeto operaciones y de
             * estar manera realizar el calulo solicitado.
             *
             * de igualmanera, en estas acciones se realizan las validaciones pertinentes segun el caso,
             * como por ejemplo la no  division por cero.
             */
            switch (opcion){
                case 1:
                    pedirDatos(suma);
                    Operaciones operacionSuma = new Operaciones(dato1, dato2, suma);
                    operacionSuma.operar();
                    System.out.println("\n\n RESULTADO: " + dato1 + " + " + dato2 + " = " + operacionSuma.getResultado());
                    break;
                case 2:
                    pedirDatos(resta);
                    Operaciones operacionResta = new Operaciones(dato1, dato2, resta);
                    operacionResta.operar();
                    System.out.println("\n\n RESULTADO: " + dato1 + " - " + dato2 + " = " + operacionResta.getResultado());
                    break;
                case 3:
                    pedirDatos(multiplicacion);
                    Operaciones operacionMultiplicacion = new Operaciones(dato1, dato2, multiplicacion);
                    operacionMultiplicacion.operar();
                    System.out.println("\n\n RESULTADO: " + dato1 + " * " + dato2 + " = " + operacionMultiplicacion.getResultado());
                    break;
                case 4:
                    pedirDatos(division);
                    if (dato2 != 0) {
                        Operaciones operacionDivision = new Operaciones(dato1, dato2, division);
                        operacionDivision.operar();
                        System.out.println("\n\n RESULTADO: " + dato1 + " / " + dato2 + " = " + operacionDivision.getResultado());

                    } else {
                        System.out.println("No se permite la division por cero");
                    }
                    break;
                case 5:
                    pedirDatos(modulo);
                    if (dato2 != 0) {
                        Operaciones operacionModulo = new Operaciones(dato1, dato2, modulo);
                        operacionModulo.operar();
                        System.out.println("\n\n RESULTADO: " + dato1 + " % " + dato2 + " = " + operacionModulo.getResultado());

                    } else {
                        System.out.println("\n\nNo se permite la division por cero\n\n");
                    }
                    break;
                default:
                    System.out.println("\n\nLa opcion ingresada no esta contemplada en nuestro sistema\n\n");
            }

        }while (opcion != 6);
        System.out.println("\n\n HASTA PRONTO.....\n\n");
    }
}
