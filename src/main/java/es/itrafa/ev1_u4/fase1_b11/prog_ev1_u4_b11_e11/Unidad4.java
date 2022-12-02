package es.itrafa.ev1_u4.fase1_b11.prog_ev1_u4_b11_e11;

import java.util.Scanner;

/**
 * Ejercicio U4_B11_E11
 * Crea un array de 5 amigos de la clase Persona.
 * Pide datos por teclado. Utiliza un bucle para recoger los datos
 * y muestra los datos del array por pantalla.
 */
public class Unidad4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int cant = 5;
        Persona[] personas = new Persona[cant];
        for(int i = 0; i < cant; i++){
            System.out.println("Introduce nombre y edad, en cada línea:");
            personas[i] = new Persona(sc.nextLine(), Integer.parseInt(sc.nextLine()));
        }
        for(Persona p:personas){
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