package Clase2;

//15) Pedir el ingreso de números hasta que se ingrese un 0. Mostrar el promedio de ellos.

import java.util.Scanner;

public class ejercicio15 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 0;
        int suma = 0;
        int contador = 0;
        float promedio = 0;

        System.out.println("Ingrese numero");
        num = input.nextInt();

        while (num != 0){
            System.out.println("Ingrese otro numero");
            num = input.nextInt();
            suma = suma + num;
            contador = contador + 1;
            promedio = suma / contador;
        }
        System.out.println("El programa finalizo porque se  ingreso un cero");
        System.out.println("El promedio es " + promedio);
    }
}