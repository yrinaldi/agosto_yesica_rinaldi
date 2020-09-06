package Clase2;
//Pedir el ingreso de 3 números, indicar si hay números repetidos utilizando solo un IF.

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un numero");
        num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = input.nextInt();

        if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
            System.out.println("Hay repetidos");
        }
        else System.out.println("NO hay repetidos");
    }
}