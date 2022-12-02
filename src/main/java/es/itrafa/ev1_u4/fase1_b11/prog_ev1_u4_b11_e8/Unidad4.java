package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e8;

/**
 * Ejercicio U4_B11_E8
 * Continua el siguiente código para duplicar el array a en b (más exacto sería decir: para
 * copiar el array referenciado por a en un array referenciado por b).
 *
 * Código:
 * class Unidad4{
 *      public static void main(String[] args){
 *          int[] a= {1,2,3,4,5};
 *          int[] b= ....
 *          for(.....
 *      }
 * }
 */
public class Unidad4 {
    public static void main (String[] args){
        int []a = {1,2,3,4, 5};
        int []b = new int[a.length];
        for(int i=0; i< a.length; i++){
            b[i] = a[i];
            System.out.println("a["+ i +"]=" + a[i] + ": b["+ i +"]=" + b[i]);
        }
        System.out.println("a = " + System.identityHashCode(a));
        System.out.println("b = " + System.identityHashCode(b));

    }
}
