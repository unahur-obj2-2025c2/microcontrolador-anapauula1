package ar.unahur.edu.obj2.patroncommand;

import java.util.List;

import ar.unahur.edu.obj2.patroncommand.command.Operable;

// SIMULADOR...
public interface Programable {
    void run(List<Operable> operaciones);
    void incProgramCounter(); // se incrementa cada vez que el
    // microcontrolador ejecuta una instruccion.
    void setAcumuladorA(Integer value);
    void setAcumuladorB(Integer value);
    void setAddr(Integer addr);
    void reset();
    Integer getProgramCounter(); //direccion en la memoria
    Integer getAcumuladorA();
    Integer getAcumuladorB();
    Integer getAddr(Integer addr);
} 
