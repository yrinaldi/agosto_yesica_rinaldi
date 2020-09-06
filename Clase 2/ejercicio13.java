package Clase2;

import java.util.Scanner;

//13) Pedir el ingreso de números hasta que se ingrese un 0.
public class ejercicio13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       int num = 0;

        System.out.println("Ingrese numero");
        num = input.nextInt();

        while (num != 0){
        System.out.println("Ingrese otro numero");
        num = input.nextInt();
        }
        System.out.println("El programa finalizo porque se  ingreso un cero");

    }

}
