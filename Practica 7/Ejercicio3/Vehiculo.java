package Clase7.Ejercicio3;

//Crear una clase Vehiculo con los atributos ruedas y color. Realizar los constructores, getters y
//setters así también como el método toString.

public class Vehiculo {

    //atributos

    private int ruedas;
    private String color;


    //constructores

    public Vehiculo(){
        this.ruedas = 4;
        this.color = "Rojo";
    }

    public Vehiculo(int cantRuedas, String unColor){
        this.ruedas = cantRuedas;
        this.color = unColor;
    }

    //GET Y SET

    public String getColor() {
        return this.color;
    }

    public int getRuedas(){
        return this.ruedas;
    }

    public void setColor(String unColor) {
        this.color = unColor;
    }

    public void setRuedas(int unasRuedas){
        this.ruedas = unasRuedas;
    }

    //Metodo toString

    public String toString (){

       return "El vehiculo tiene " + this.ruedas + " ruedas " +" y es de color " + this.color;
    }

}
