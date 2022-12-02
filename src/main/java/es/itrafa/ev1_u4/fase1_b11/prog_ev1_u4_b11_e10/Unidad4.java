package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e10;

/**
 * Ejercicio U4_B11_E10
 * Con las dos sintaxis anteriores, imprime por pantalla el siguiente array.
 * char[] vocales = {'a', 'e','i','o','u'};
 */
public class Unidad4 {
    public static void main (String[] args){
        char[] vocales = {'a', 'e','i','o','u'};

        for(int i = 0; i< vocales.length; i++){
            System.out.println("vocal[" + i + "]=" + vocales[i]);
        }
        System.out.println();
        for(char v:vocales){
            int i = 0;
            System.out.println("vocal[" + i++ + "]=" + v);
        }
    }
}
