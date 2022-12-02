package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e9;

/**
 * Ejercicio U4_B11_E9
 * Vuelve a escribir el siguiente ejemplo de copia de arrays utilizando la propiedad length.
 * class Unidad4{
 * public static void main(String[] args){
 * int[] a= {1,2,3,4,5};
 * int[] b= new int[5]; //o también int[] b= {0,0,0,0,0};
 * for(int i=0;i<5;i++){
 * b[i]=a[i];
 * System.out.print("a[" + i +"]:" + a[i]);
 * System.out.println(" b[" + i +"]:" + b[i]);
 * }
 * }
 * }
 * <p>
 * Escribe la solución de tres formas:
 *  ● todo en el main
 *  ● haciendo un método estático que haga la copia de los arrays. El método tendrá como
 *      parámetros el array origen y el array copia. Como los arrays son objetos, realmente
 *      no hay ninguna novedad ya que ya pasamos muchas veces una referencia por parámetro.
 *  ● haciendo un método estático que se le pasa por parámetro el array origen y
 *      devuelve en el return la copia
 */
public class Unidad4 {
    public static void main (String[] args){
        int []a = {1,2,3,4, 5};

        // todo en el main
        int []b = new int[a.length];

        System.out.println("a: " + System.identityHashCode(a) + ": b: " + System.identityHashCode(b));
        for(int i=0; i< a.length; i++){
            b[i] = a[i];
            System.out.print("a[" + i +"]:" + a[i]);
            System.out.println(" b[" + i +"]:" + b[i]);
        }
        System.out.println();

        // método estático 2 parámetros
         b = new int[a.length];
        copyArrayToOther(a, b);
        System.out.println("a: " + System.identityHashCode(a) + ": b: " + System.identityHashCode(b));
        for(int i=0; i< a.length; i++){
            System.out.print("a[" + i +"]:" + a[i]);
            System.out.println(" b[" + i +"]:" + b[i]);
        }
        System.out.println();

        // método estático 2 parámetros
        b = new int[a.length];
        b = copyArray(a);
        System.out.println("a: " + System.identityHashCode(a) + ": b: " + System.identityHashCode(b));
        for(int i=0; i< a.length; i++){
            System.out.print("a[" + i +"]:" + a[i]);
            System.out.println(" b[" + i +"]:" + b[i]);
        }
    }

    private static void copyArrayToOther(int[] a, int[] b) {
        for(int i=0; i< a.length; i++){
            b[i] = a[i];
        }
    }

    private static int[] copyArray(int[] a) {
        int[] b = new int[a.length];
        for(int i=0; i< a.length; i++){
            b[i] = a[i];
        }
        return b;
    }
}