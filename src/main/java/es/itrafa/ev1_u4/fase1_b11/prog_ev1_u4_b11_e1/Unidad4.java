package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e1;

/**
 * Ejercicio U4_B11_E1:
 * Crea un array que almacene las 5 vocales y luego las imprime.
 */
public class Unidad4 {
    public static void main (String[] args){
        char[] vocales = new char[5];
        vocales[0] = 'a';
        vocales[1] = 'e';
        vocales[2] = 'i';
        vocales[3] = 'o';
        vocales[4] = 'u';

        for(int i=0; i<vocales.length; i++){
            System.out.print(vocales[i] + " ");
        }
        System.out.println();
    }
}
