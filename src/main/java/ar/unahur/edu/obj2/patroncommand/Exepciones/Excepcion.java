package ar.unahur.edu.obj2.patroncommand.Exepciones;

public class Excepcion extends RuntimeException{
    // contructor por defecto
    public Excepcion(){}
    // contructor con mensaje
    public Excepcion(String mensaje){
        super(mensaje);
    }
}
