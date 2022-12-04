package es.itrafa.ev1_u4.fase2_b13.prog_ev1_u4_b3_e14;

/**
 * Ejercicio U4_B3_E14: Vuelve a escribir el ejemplo anterior con la sintaxis tradicional del
 * for y sin utilizar la sintaxis de inicialización de arrays con {}.
 * <p>
 * <strong>Ejemplo anterior</strong>
 * <pre>{@code
 *
 * class Unidad4{
 *      public static void main(String[] args){
 *          String[] cadenas ={"Esta", "es", "una", "prueba." };
 *          System.out.println("Array original: ");
 *          for(String s:cadenas)
 *              System.out.print(s + " ");
 *          cadenas[0]="y esta";
 *          cadenas[2]="otra";
 *          System.out.println("\nArray modificado: ");
 *          for(String s:cadenas)
 *              System.out.print(s + " ");
 *      }
 * }
 *  }</pre>
 */
class Unidad4 {
    public static void main(String[] args) {
        String[] cadenas = new String[4];
        cadenas[0] = "Esta";
        cadenas[1] = "es";
        cadenas[2] = "una";
        cadenas[3] = "prueba";

        System.out.println("Array original: ");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print(cadenas[i] + " ");
        }

        cadenas[0] = "y esta";
        cadenas[2] = "otra";
        System.out.println("\nArray modificado: ");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print(cadenas[i] + " ");
        }
    }
}