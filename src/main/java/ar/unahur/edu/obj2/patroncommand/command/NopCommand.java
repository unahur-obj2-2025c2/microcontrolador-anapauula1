package ar.unahur.edu.obj2.patroncommand.command;

import ar.unahur.edu.obj2.patroncommand.Programable;

public class NopCommand implements Operable{
    // no realiza ninguna operacion, sigue con la instruccion
    @Override
    public void execute(Programable micro) {} // vacio
}


