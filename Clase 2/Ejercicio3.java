package Clase2;

import java.util.Scanner;

//Pedir el ingreso de 3 números y mostrar la suma de ellos.
public class Ejercicio3 {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        //TECLADO
        Scanner input = new Scanner(System.in);

        //MOSTRAR
        System.out.println("Ingrese el primer numero ");
        num1 =  input.nextInt();
        System.out.print("Ingrese el segundo numero ");
        num2 =  input.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = input.nextInt();

        int suma = (num1 + num2 + num3);

        System.out.println("La suma es "+ suma);
    }


}
