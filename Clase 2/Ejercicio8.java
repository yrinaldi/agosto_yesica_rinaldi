package Clase2;

import java.util.Scanner;

//Pedir el ingreso de números hasta que aparezca uno negativo.
public class Ejercicio8 {

    public static void main(String[] args) {

        int num = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num = input.nextInt();

        //HACER MIENTRAS
            while (num > 0) {
                System.out.println("Ingrese un numero");
                num = input.nextInt();
            }
          System.out.println("El programa finalizo porque se ingreso un negativo");
    }

}
