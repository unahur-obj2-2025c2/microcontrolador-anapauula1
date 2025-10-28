package ar.unahur.edu.obj2.patroncommand.Exepciones;

public class EstaElNumeroEnRango extends RuntimeException{
    // contructor por defecto
    public EstaElNumeroEnRango(){}
    // contructor con mensaje
    public EstaElNumeroEnRango(String mensaje){
        super(mensaje);
    }
}
