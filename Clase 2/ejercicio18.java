package Clase2;

//18) Imprimir los números del 10 al 1000, de 10 en 10.

import java.util.Scanner;

public class ejercicio18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;

        for (i=10; i<=1000; i=i+10){
            System.out.println(i);
        }

    }

}
