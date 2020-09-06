package Clase2;

//16) Mostrar el resultado del examen:
//a) Si la nota está entre 0 y 59 → Eliminado
//b) Si la nota está entre 60 y 79 → Aprobado
//c) Si la nota está entre 80 y 100 → Aprobado con Excelente

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int nota = 0;

        System.out.println("Ingrese nota");
        nota = input.nextInt();

        if (nota >=0 && nota<= 59){
            System.out.println("ELIMINADO");
        }
        else if( nota>=60 && nota <=79){
            System.out.println("APROBADO");
        }
        else if (nota>=80 && nota <=100){
            System.out.println("APROBADO CON EXCELENTE");
        }
    }
}
