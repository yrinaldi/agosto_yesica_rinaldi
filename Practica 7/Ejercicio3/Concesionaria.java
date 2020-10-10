package Clase7.Ejercicio3;

//Crear desde el main, dos motocicletas y dos semirremolques.

import java.util.Scanner;

public class Concesionaria {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Auto a1 = new Auto();
        Auto a2 = new Auto(4, "BLANCO", 290, "4000 cc");

        Motocicleta m1 = new Motocicleta();
        Motocicleta m2 = new Motocicleta(2, "VERDE", 120, "150 cc");

        Semiremolque s1 = new Semiremolque();
        Semiremolque s2 = new Semiremolque(4, "AZUL", 6);


        System.out.println("***************AUTO**************");
        System.out.println(a1);
        System.out.println(a2);
        System.out.println("************ MOTOCICLETA ************+");
        System.out.println(m1);
        System.out.println(m2);

        System.out.println("************ SEMI REMOLQUE************+");
        System.out.println(s1);
        System.out.println(s2);

    }
}
