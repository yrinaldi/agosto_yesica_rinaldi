package Clase5Objetos;

public class Camion {

    //Atributos
    private int chapa;
    private String color;
    private int añoCompra;

    //Constructor sin parametros
    public Camion() {
        this.color = "Rojo";
        this.chapa = 123;
        this.añoCompra = 1982;
    }

    //Constructor con parametros
    public Camion(String unColor, int unaChapa, int unaCompra) {
        this.color = unColor;
        this.chapa = unaChapa;
        this.añoCompra = unaCompra;
    }

    //get
    public String getColor() {
        return this.color;
    }

    public int getChapa() {
        return this.chapa;
    }

    public int getAñoCompra() {
        return añoCompra;
    }

    //set
    public void setColor(String unColor) {
        this.color = unColor;
    }

    public void setChapa(int unaChapa) {
        this.chapa = unaChapa;
    }

    public void setAñoCompra (int unaCompra){
        this.añoCompra = unaCompra;
    }

    public String toString() {
        return "El color es " + this.color + " " + "Y la chapa es" + this.chapa + "Fue comprado en el año "+ " " + this.añoCompra;
    }


    public static boolean leTocaRevision(int añoCompra){
    if (this.añoCompra <= 2015){
        return true;
        } else {
        return false;
        }
    }
}