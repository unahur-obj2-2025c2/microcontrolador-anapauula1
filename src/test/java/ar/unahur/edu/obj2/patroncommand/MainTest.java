package ar.unahur.edu.obj2.patroncommand;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import ar.unahur.edu.obj2.patroncommand.command.AddCommand;
import ar.unahur.edu.obj2.patroncommand.command.LodAddr;
import ar.unahur.edu.obj2.patroncommand.command.LodvValCommand;
import ar.unahur.edu.obj2.patroncommand.command.NopCommand;
import ar.unahur.edu.obj2.patroncommand.command.Operable;
import ar.unahur.edu.obj2.patroncommand.command.StrAddr;
import ar.unahur.edu.obj2.patroncommand.command.SwapCommand;

public class MainTest {
    @Test
    void testMain() {
        assertTrue(Boolean.TRUE);
    }
    @Test
    void hacerAvanzartresPosiciones() {
        Programable micro1 = new Microcontrolador();
        
        List<Operable> operacioness = List.of(
            new NopCommand(),
            new NopCommand(),
            new NopCommand()
        );
        micro1.run(operacioness);
        assertEquals(micro1.getProgramCounter(), 3);
    }
    @Test
    void sumarVeintemasDiecisiete() {
        Programable micro = new Microcontrolador();
        // armamos la lista con las operacionees
        List<Operable> operaciones2 = List.of(
          new LodvValCommand(20),
          new SwapCommand(),
          new LodvValCommand(17),
          new AddCommand()  
        );
        micro.run(operaciones2);
        assertEquals(micro.getAcumuladorA(), 37);
    }
    @Test
    void pcDeCuatro() {
        Programable micro = new Microcontrolador();
        // armamos la lista con las operacionees
        List<Operable> operaciones2 = List.of(
          new LodvValCommand(20),
          new SwapCommand(),
          new LodvValCommand(17),
          new AddCommand()  
        );
        micro.run(operaciones2);
        assertEquals(micro.getProgramCounter(), 4);
    }
    @Test
    void elAcumuladorAesdeQuince() {
        Programable micro = new Microcontrolador();
        // armamos la lista con las operacionees
        List<Operable> operaciones3 = List.of(
          new LodvValCommand(2),
          new StrAddr(0),
          new LodvValCommand(8),
          new SwapCommand(),
          new LodvValCommand(5),
          new AddCommand(),
          new SwapCommand(),
          new LodAddr(0),
          new AddCommand()
        );
        micro.run(operaciones3);
        assertEquals(micro.getAcumuladorA(), 15);
    }
    @Test
    void elAcumuladorBEsDeCero() {
        Programable micro = new Microcontrolador();
        // armamos la lista con las operacionees
        List<Operable> operaciones3 = List.of(
          new LodvValCommand(2),
          new StrAddr(0),
          new LodvValCommand(8),
          new SwapCommand(),
          new LodvValCommand(5),
          new AddCommand(),
          new SwapCommand(),
          new LodAddr(0),
          new AddCommand()
        );
        micro.run(operaciones3);
        assertEquals(micro.getAcumuladorB(), 0);
    }
}
