package ar.unahur.edu.obj2.patroncommand.command;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class SwapCommand implements Operable {
    // INTERCAMBIA LOS VALORES
    @Override
    public void execute(Programable micro) {
        Integer valorA = micro.getAcumuladorA();
        Integer valorB = micro.getAcumuladorB(); 

        micro.setAcumuladorA(valorB);
        micro.setAcumuladorB(valorA);
    }
}
