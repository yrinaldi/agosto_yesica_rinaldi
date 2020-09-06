package Clase3;
//9) Realizar un método llamado calcularPromedio , que solicite el ingreso de números
//hasta que se ingrese 0, y que calcule el promedio de los mismos. Se debe utilizar el
//método ingresarNumero.

import java.util.Scanner;

public class parte2ejer9 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese numero");
        float numero = input.nextFloat();

        System.out.println("el promedio es " + calcularPromedio(numero));
    }


    public static float calcularPromedio (float nume) {
    Scanner input = new Scanner(System.in);
    float suma =0;
    int cont = 0;
    float promedio =1;
    nume = ingresarNumero( "Ingrese numero");

        while (nume !=0){
            suma = suma + nume;
            cont++;
            nume = ingresarNumero( "Ingrese otro numero");

        }
            System.out.println("El programa termino porque se ingreso un cero");
            promedio = suma / cont;
        return promedio;
    }

    public static int ingresarNumero (String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        int num = input.nextInt();
        return num;
    }
    }

