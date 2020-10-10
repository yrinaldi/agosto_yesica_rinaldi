package Clase5Objetos;

public class Libreria {

    public static void main(String[] args) {

        Libro l1 = new Libro();
        System.out.println(l1);

        Libro l2 = new Libro(3456, "Punto Limite", null, 384);
        System.out.println(l2);
    }
}