package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e7;

/**
 * Ejercicio U4_B11_E7
 * Añade código al ejemplo anterior de forma que demuestre que si añado
 * int[] c;
 * c=a;
 * a=b;
 * <p>
 * Ejemplo anterior:
 * <p>
 * class Unidad4{
 * public static void main(String[] args){
 * int[] a = {0,2,4,6,8};
 * int[] b = {1,3,5,7,9};
 * System.out.println("Array referenciado por a: ");
 * for(int i=0;i<5;i++)
 * System.out.print(a[i] + " ");
 * System.out.println("\nArray referenciado por b: ");
 * for(int i=0;i<5;i++)
 * System.out.print(b[i] + " ");
 * System.out.println();
 * }
 * }
 */
class Unidad4 {
    public static void main(String[] args) {
        int[] a = {0, 2, 4, 6, 8};
        int[] b = {1, 3, 5, 7, 9};
        System.out.println("ORIGINALES");
        System.out.println("a: "+System.identityHashCode(a));
        System.out.println("b: "+System.identityHashCode(b));
        int[] c;
        c = a;
        a = b;

        System.out.println("Array referenciado por a: ");
        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + " ");
        System.out.println("\nArray referenciado por b: ");
        for (int i = 0; i < 5; i++)
            System.out.print(b[i] + " ");
        System.out.println("\nArray referenciado por c: ");
        for (int i = 0; i < 5; i++)
            System.out.print(c[i] + " ");

        System.out.println();
        System.out.println("MODIFICADOS");

        System.out.println("a: "+System.identityHashCode(a));
        System.out.println("b: "+System.identityHashCode(b));
        System.out.println("c: "+System.identityHashCode(c));
    }
}