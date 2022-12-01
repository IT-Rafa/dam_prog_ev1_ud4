package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e3;

/**
 * Ejercicio U4_B11_E3:
 * modifica el ejemplo anterior de encontrar mínimo y máximo para que el array se
 * inicialice cuando se cree.
 *
 * Ejemplo enunciado:
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
        int[] nums= {7, 10, 3, 34, 13};
        int min , max;

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
