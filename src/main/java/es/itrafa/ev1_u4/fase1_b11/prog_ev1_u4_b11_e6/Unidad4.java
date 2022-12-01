package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e6;

/**
 * Ejercicio U4_B11_E6:
 * Acepta el reto ¿Cuántos días faltan? id 157
 * Podemos almacenar en un array los días que tiene cada mes por ejemplo:
 * int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
 *
 * Enunciado Acepta el reto
 *  ¿Cuantos días faltan?
 *  Tiempo máximo: 1,000 s Memoria máxima: 4096 KiB
 *
 *  Dado un día del año, ¿sabrías decir cuantos días faltan para Nochevieja?
 *  Asumiremos que nos encontramos en un año no bisiesto.
 *
 *  Entrada
 *
 *  La entrada comenzará con un entero para especificar el número de casos de
 *  prueba que vendrá a continuación. Para cada caso de prueba se mostrará una
 *  línea en la que aparecerán dos enteros, el primero de ellos será correspondiente
 *  al día y el segundo correspondiente al mes de una fecha válida.
 *
 *  Salida
 *
 *  Para cada fecha de la entrada, se mostrarán el número de días completos que
 *  faltan hasta el día de Nochevieja.
 *
 *  Entrada de ejemplo
 *
 *  3
 *  28 12
 *  30 12
 *  1 1
 *
 *  Salida de ejemplo
 *
 *  3
 *  1
 *  364
 */
import java.util.Scanner;
public class Unidad4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] diasMes={31,28,31,30,31,30,31,31,30,31,30,31};
        int sol;
        int casos = sc.nextInt();
        for(int i =0; i < casos; i++){
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            sol = 0;
            for (int j = mes ; j < diasMes.length; j++){
                sol += diasMes[j];
            }

            sol += diasMes[mes-1] - dia;
            System.out.println(sol);

        }


    }
}
