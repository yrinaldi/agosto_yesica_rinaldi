package Clase2;
//33) Pedir el ingreso de números hasta que aparezca uno negativo. Indicar el promedio de
//todos los números ingresados.

import java.util.Scanner;

public class ejercicio33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int num = input.nextInt();
        int suma = 0;
        int cant = 0;
        float promedio = 0;

        while (num > 0){
        suma = suma + num;
        System.out.println("Ingrese un numero");
        num = input.nextInt();
        cant = cant +1;

        }
        promedio = suma / cant;

         System.out.println("la suma es " + suma);
        System.out.println("el promedio es " + promedio);
    }

}
