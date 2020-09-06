package Clase2;
//21) Mostrar los números pares de 1 a 4000.

public class ejercicio21 {

    public static void main(String[] args) {

        for (int i=1; i<=4000 ; i = i+1 ){
            if (i %2 ==0){
                System.out.println(i);
            }
        }
    }

}
