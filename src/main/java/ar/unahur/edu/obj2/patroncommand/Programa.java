package ar.unahur.edu.obj2.patroncommand;

import java.util.ArrayList;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.command.Operable;

public class Programa {
    List<Operable> instrucciones = new ArrayList<>();
    
    public void run(Programable micro){
        micro.run(instrucciones); // corre la lista
    }
    public void agregarOperacion(Operable unaOperacion){
        instrucciones.add(unaOperacion);
    }
}
