package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e13;

import java.util.Scanner;

/**
 * Ejercicio U4_B11_E13
 * Repetimos la creación del array de amigos, pero ahora no hay límite de amigos,
 * simplemente, cada vez que se añade un amigo nuevo, creamos un nuevo array que
 * contiene todos los amigos del array viejo y el nuevo amigo. Para copiar el array viejo en el
 * nuevo puedes hacerlo “a mano” o utilizar System.arraycopy().
 */
public class Unidad4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int cant = 1;
        Persona[] personas = new Persona[0];

        while(true){
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            if(nombre.toLowerCase().equals("fin")){
                break;

            }else{
                System.out.print("Edad: ");
                int edad = Integer.parseInt(sc.nextLine());

                Persona p = new Persona(nombre, edad);

                Persona[] newArray = new Persona[personas.length+1];
                System.arraycopy(personas, 0, newArray, 0,personas.length);
                personas = newArray;
                personas[personas.length-1] = p;
            }
        }


        for(Persona p:personas){
            if (p == null){
                break;
            }
            System.out.println(p.nombre + " " + p.edad);
        }
    }
}
class Persona{
    String nombre;
    int edad;
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}