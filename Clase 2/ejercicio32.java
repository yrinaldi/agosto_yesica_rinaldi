package Clase2;
//32) Mostrar los múltiplos de 9 entre 0 y 100 que sean impares. USANDO WHILE.

public class ejercicio32 {

    public static void main(String[] args) {

        int i = 10;

        while (i<=100){
        if (i % 9 == 0 && i % 2 == 1) {
            System.out.println(i);
             }
           i++;
        }
    }
}
