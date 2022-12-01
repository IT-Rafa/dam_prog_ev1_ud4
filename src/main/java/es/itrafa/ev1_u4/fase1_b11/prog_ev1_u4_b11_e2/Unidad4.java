package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e2;

/**
 * Ejercicio U4_B11_E2:
 * Añade el código necesario al siguiente ejemplo para que encuentre
 * los valores máximos y mínimos del array y los imprima por pantalla.
 *
 * Ejemplo:
 * class Unidad4{
 *      public static void main(String[] args){
 *          int[] nums= new int[5];
 *          int min , max;
 *          nums[0]=7;
 *          nums[1]=10;
 *          nums[2]=3;
 *          nums[3]=34;
 *          nums[4]=13;
 *          ......................................
 *      }
 * }
 */
class Unidad4{
    public static void main(String[] args){
        int[] nums= new int[5];
        int min , max;
        nums[0]=7;
        nums[1]=10;
        nums[2]=3;
        nums[3]=34;
        nums[4]=13;

        max = min =nums[0];
        for (int i= 0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        System.out.println("min = "+ min);
        System.out.println("max = "+ max);

    }
}