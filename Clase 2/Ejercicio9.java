package Clase2;
//Programa Java que pida un número NUM ingresado por el usuario. Luego muestre los
//números desde 1 hasta NUM utilizando la instrucción for. Ejemplo. NUM = 5

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;

    System.out.println("Ingrese un numero");
    num = input.nextInt();

    for (int i=1; i<=num ; i++) {
        System.out.println (i + " ");
    }
    }
    }
