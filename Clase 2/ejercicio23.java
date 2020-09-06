package Clase2;
//23) Mostrar los números múltiplos de 3, que se encuentran entre 10 al 40 utilizando un for.
//Es decir, 12,15,18…

public class ejercicio23 {

    public static void main(String[] args) {

        for (int i=10; i<=40; i++){
            if (i % 3 ==0){
                System.out.println(i);
            }

        }

    }

}
