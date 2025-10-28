package ar.unahur.edu.obj2.patroncommand.command;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class StrAddr implements Operable{
    private Integer addr;

    public StrAddr(Integer addr) {
        this.addr = addr;
    }

    @Override
    public void execute(Programable micro) {
        micro.setAddr(addr);
    }
}
