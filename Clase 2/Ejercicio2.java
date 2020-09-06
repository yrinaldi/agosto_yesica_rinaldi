package Clase2;

import java.util.Scanner;

public class Ejercicio2 {

//Pedir el ingreso del nombre y el año de nacimiento. Mostrar el nombre y la edad de la
//persona.

    //INICIO
    public static void main(String[] args) {
     String nombre = "";  //declaro las variables
     int año = 0;
        //TECLADO
     Scanner input = new Scanner(System.in);

     // MOSTRAR
     System.out.println ("Ingrese nombre");
     nombre= input.next ();
     System.out.println ("Ingrese año de nacimiento");
     año = input.nextInt();

     //MOSTRAR
        System.out.println("El nombre  es " + nombre + " y el año de nacimiento es " + año);
            }
}


