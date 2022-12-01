package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e4;

/**
 * Ejercicio U4_B11_E4: imprime la media del siguiente array
 * double[] notas = {8.5,7.0,6.0,9.2};
 */
public class Unidad4 {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 6.0, 9.2};
        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        System.out.println("media = " + media / notas.length);
    }
}
