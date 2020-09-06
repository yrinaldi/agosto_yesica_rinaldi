package Clase2;
//Pedir el ingreso de 3 números, indicar si hay números repetidos.

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);
        //MOSTRAR
        System.out.print("Ingrese el primer numero ");
        //GUARDAR
        num1 = input.nextInt();

        System.out.print("Ingrese el segundo numero ");
        num2 = input.nextInt();

        System.out.print("Ingrese el tercer numero");
        num3 = input.nextInt();

        if (num1 == num2) {
            System.out.print("Hay repetidos");
        }
        if (num1 == num3) {
            System.out.print("Hay repetidoss");
        }
        if (num2 == num3) {
            System.out.print("Hay repetidos");
        } else System.out.print("NO hay repetidos");

    }}
