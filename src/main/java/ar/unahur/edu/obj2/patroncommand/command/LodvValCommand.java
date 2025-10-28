package ar.unahur.edu.obj2.patroncommand.command;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class LodvValCommand implements Operable {
    private Integer val;

    public LodvValCommand(Integer val) {
        this.val = val;
    }

    @Override
    public void execute(Programable micro) {
        micro.setAcumuladorA(val);
    }
}


