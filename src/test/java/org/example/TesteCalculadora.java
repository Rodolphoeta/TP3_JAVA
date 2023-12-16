package org.example;

import org.example.calculoDeMedia.CalculandoMedia;
import org.example.calculoDeSoma.CalculandoSoma;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TesteCalculadora {
    @Test
    public void TesteCalculandoMedia(){

        int resultado = CalculandoMedia.MediaEntreDoisNumeros(10, 10);
        assertEquals(10, resultado);

    }

    @Test
    public void TesteCalculandoSoma(){

        int resultado = CalculandoSoma.SomaEntreDoisNumeros(10, 10);
        assertEquals(20, resultado);

    }
}
