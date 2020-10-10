package Clase7.Ejercicio3;

//Crear una clase Auto con los atributos velocidadMáxima y cilindrada de tipo int y String
//respectivamente. Realizar los constructores, getters y setters así también como el método
//toString.

public class Auto  extends Vehiculo{

    private int velocidadMaxima;
    private String cilindrada;

    //constructor sin parametros
    public Auto(){
        this.velocidadMaxima = 160;
        this.cilindrada = "4000cc";
    }

    //constructor con parametros
    public Auto(int cantRuedas, String unColor, int unaVelocidadMaxima, String unaCilindrada ){
        super (cantRuedas, unColor);
        this.velocidadMaxima = unaVelocidadMaxima;
        this.cilindrada = unaCilindrada;
    }


    //Getters y Setters

    public String getCilindrada() {
        return this.cilindrada;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int unaVelocidadMaxima){
        this.velocidadMaxima = unaVelocidadMaxima;
    }

    public void setCilindrada(String unaCilindrada){
        this.cilindrada = unaCilindrada;
    }

    //Metodo ToString

    public String toString (){
        super.toString();
        return "La velocidad maxima es " + getVelocidadMaxima() + " y la cilindrada es de: " + getCilindrada() + " " + super.toString();
    }

}
