package Clase7.Ejercicio3;

//Crear una clase SemiRemolque con el atributo de cantidadEjes (int). Realizar los constructores
//con y sin parámetros, getters y setters así también como el método toString.

public class Semiremolque extends Vehiculo {

    private int cantidadEjes;

    //constructores
    public Semiremolque() {
        this.cantidadEjes = 2;
    }

    public Semiremolque(int cantRuedas, String unColor, int unaCantidadEjes) {
        super (cantRuedas, unColor);
        this.cantidadEjes = unaCantidadEjes;
    }


    //SETTERS Y GETTERS
    public int getCantidadEjes() {
        return cantidadEjes;
    }

    public void setCantidadEjes(int cantidadEjes) {
        this.cantidadEjes = cantidadEjes;
    }

    //METODO TOSTRING

    public String toString() {
        super.toString();
        return " Cantidad de ejes " + getCantidadEjes() + " " + super.toString();
    }

}
