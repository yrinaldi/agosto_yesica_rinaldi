package Clase2;
//Pedir el ingreso de un dato, e indicar si es menor o mayor a 0

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int num = 0;
        //TECLADO
        Scanner input = new Scanner(System.in);
        //MOSTRAR
        System.out.println("Ingrese un numero");
        //GUARDAR
        num = input.nextInt();

        if (num > 0) {
            System.out.println("es mayor a cero");
        } if (num < 0) {
            System.out.println("Es menor a cero");
        }
        if (num == 0 ) {
            System.out.println("Es igual a cero");
        }
    }
}

