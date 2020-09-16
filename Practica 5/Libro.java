package Clase5Objetos;

public class Libro {

//Atributos
    private int Icbn;
    private String Titulo;
    private String Autor;
    private int NroPaginas;

//Constructor sin parametros

    public Libro(){
        this.Icbn = 1234;
        this.Titulo = "Sin Tìtulo";
        this.Autor = "George O`Donell";
        this.NroPaginas = 263;
    }

//Constructor con paràmetros

    public Libro(int unIcbn, String unTitulo, String unAutor, int unNroPaginas){
        this.Icbn = unIcbn;
        this.Titulo = unTitulo;
        this.Autor = unAutor;
        this.NroPaginas = unNroPaginas;
    }

//Set

    public void setIcbn(int unIcbn) {
        this.Icbn = unIcbn;
    }
    public void setTitulo (String unTitulo){
        this.Titulo= unTitulo;
    }
    public void setAutor (String unAutor){
        this.Autor=unAutor;
    }
    public void setNroPaginas (int unNroPaginas){
        this.NroPaginas=unNroPaginas;
    }

//Get

    public int getIcbn() {
        return this.Icbn;
    }
    public  String getTitulo(){
        return this.Titulo;
    }
    public String getAutor(){
        return this.Autor;
    }
    public int getNroPaginas(){
        return this.NroPaginas;
    }

//ToString

    public String toString (){
        String imprimir = "El libro con ISBN " + this.Icbn + " creado por el autor " + this.Autor + " tiene "+ this.NroPaginas + " paginas";

       if (this.Autor == null){
           imprimir = imprimir +  " Autor desconocido";
       }

        return imprimir;
    }
}


