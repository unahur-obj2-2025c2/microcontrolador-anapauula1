package ar.unahur.edu.obj2.patroncommand.command;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class LodAddr implements Operable {
   private Integer addr; //direccion en memoria

    public LodAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    public void execute(Programable micro) {
        micro.setAcumuladorA(micro.getAddr(addr));
    }
}

