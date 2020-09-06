package Clase2;

//Pedir el ingreso de 3 números e indicar si NO hay repetidos, es decir, si son todos
//diferentes.

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = input.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = input.nextInt();

        if ( (num1 != num2) && (num1!=num3) && (num2!=num3))
            System.out.println("NO hay repetidos");
        else
            System.out.println("Hay repetidos");
    }
}
