package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e12;

import java.util.Scanner;

/**
 * Ejercicio U4_B11_E12
 * Modifica el ejercicio anterior de forma que funcione para un número indeterminado de
 * amigos. Al teclear un nombre de amigo “fin” se asume que ya no se quieren introducir más
 * amigos. Como no sabes a priori el número de amigos que serán introducidos
 * utiliza un array de tamaño 100 elementos.
 * Tras introducir los amigos, el programa imprime el array.
 */
public class Unidad4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int cant = 100;
        Persona[] personas = new Persona[cant];
        for(int i = 0; i < cant; i++){
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            if (nombre.toLowerCase().equals("fin")){
                break;
            }else{
                System.out.print("Edad: ");
                int edad = Integer.parseInt(sc.nextLine());
                personas[i] = new Persona(nombre, edad);
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