package Clase2;

//27) Mostrar por pantalla cuántos múltiplos de 3 existen entre el 10 y el 70.

public class ejercicio27 {

    public static void main(String[] args) {

        int cant_multiplos = 0;

        for ( int i=10; i<=70; i++){
            if (i % 3 ==0){
                cant_multiplos = cant_multiplos + 1;
            }
        }
        System.out.println("la cantidad de multiplos es " + cant_multiplos);
    }

}
