package ar.unahur.edu.obj2.patroncommand;

import java.util.Arrays;
import java.util.List;

import ar.unahur.edu.obj2.patroncommand.Exepciones.EstaElNumeroEnRango;
import ar.unahur.edu.obj2.patroncommand.command.Operable;

public class Microcontrolador implements Programable {
    private Integer acumuladorA = 0;
    private Integer acumuladorB = 0;
    private Integer programCounter = 0;
    private List<Integer> memoria = Arrays.asList(new Integer[1024]);

    @Override
    public Integer getAcumuladorA() {
        return acumuladorA;
    }
    @Override
    public Integer getAcumuladorB() {
        return acumuladorB;
    }
    @Override
     public Integer getAddr(Integer addr) {
        estaEnRango(addr);
        return memoria.get(addr);
    }
    @Override
    public Integer getProgramCounter() {
        return programCounter;
    }
    @Override
    public void incProgramCounter() {
        programCounter ++;
    }
    @Override
    public void reset() {
        this.acumuladorA = 0;
        this.acumuladorB = 0;
        this.programCounter = 0;  
    }
    @Override
    public void run(List<Operable> operaciones) {
        operaciones.forEach(o -> {o.execute(this); incProgramCounter();});
    }
    @Override
    public void setAcumuladorA(Integer value) {
        this.acumuladorA = value;
    }
    @Override
    public void setAcumuladorB(Integer value) {
        this.acumuladorB = value;
    }
    @Override
    public void setAddr(Integer addr) {
        estaEnRango(addr);
        memoria.set(addr, acumuladorA);
    }
    public void estaEnRango(Integer addr){
         if (addr >= memoria.size() || addr < 0) {
            throw new EstaElNumeroEnRango("La dirección de memoria ingresada está fuera de los límites.");
        }
    }
}
