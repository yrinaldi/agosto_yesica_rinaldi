package Clase7.Ejercicio3;

//Crear una clase Motocicleta con los atributos velocidad y cilindrada de tipo int y String
//respectivamente. Realizar los constructores, getters y setters así también como el método
//toString.

public class Motocicleta extends Vehiculo {

    private int Velocidad;
    private String Cilindrada;

        //constructor sin parametros

    public Motocicleta(){
        this.Velocidad = 110;
        this.Cilindrada = "125c";
    }

    //constructor con parametros

    public Motocicleta(int cantRuedas, String unColor, int unaVelocidad, String unaCilindrada){
        super (cantRuedas, unColor);
        this.Velocidad = unaVelocidad;
        this.Cilindrada = unaCilindrada;

    }

    //SETTERS Y GETTERS

    public int getVelocidad() {
        return this.Velocidad;
    }
    public String getCilindrada(){
        return this.Cilindrada;
    }

    public void setVelocidad( int unaVelocidad){
        this.Velocidad = unaVelocidad;
    }
    public void setCilindrada(String unaCilindrada){
        this.Cilindrada = unaCilindrada;
    }

    //toString

    public String toString(){
    super.toString();
        return "La Motocicleta posee "+ getCilindrada() + " de cilindrada y alcanza una velocidad de " + getVelocidad() + " kms/ hora. " + super.toString();
    }

}


