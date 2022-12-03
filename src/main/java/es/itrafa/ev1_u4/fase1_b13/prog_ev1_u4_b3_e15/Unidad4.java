package es.itrafa.ev1_u4.fase1_b13.prog_ev1_u4_b3_e15;

/**
 * Ejercicio U4_B3_E15:
 * Escribe un programa que le pasemos por consola del sistema, una palabra,
 * y la rote hasta obtener de nuevo el original como en el siguiente ejemplo.
 * <p>
 * acueducto
 * cueductoa
 * ueductoac
 * ..
 * acueducto
 */
public class Unidad4 {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("No argumentos en comando");
            return;
        }
        for (int i = 0; i <= args[0].length(); i++) {

            for(int j = i; j < args[0].length(); j++){
                System.out.print(args[0].charAt(j));
            }

            for(int j = 0; j < i; j++){
                System.out.print(args[0].charAt(j));
            }
            System.out.println();
        }
    }
}
