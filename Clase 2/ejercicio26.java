
//26) Calcular la suma de los 10 primeros números naturales.
package Clase2;

public class ejercicio26 {

    public static void main(String[] args) {

        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma = suma + i;
        }

        System.out.println("la suma es " + suma);
    }
}