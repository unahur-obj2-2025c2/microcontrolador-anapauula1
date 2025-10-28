package ar.unahur.edu.obj2.patroncommand.command;


import ar.unahur.edu.obj2.patroncommand.Programable;

public class AddCommand implements Operable {
    // suma los valores de los dos acumuladores
    @Override
    public void execute(Programable micro) {
        Integer suma = micro.getAcumuladorA() + micro.getAcumuladorB();
        micro.setAcumuladorA(suma);
        micro.setAcumuladorB(0); // el valor B debe de ser = 0;
    }
}
