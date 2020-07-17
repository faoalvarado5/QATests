package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GraficaIndividualTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void obtenerMinimoValor() {

        // Caso de prueba #56
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        GraficaIndividual gf = new GraficaIndividual(array, 1, 1);
        assertEquals(gf.obtenerMinimoValor() ,1);
    }

    @Test
    void obtenerMaximoValor() {

        // Caso de prueba #57
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        array.add(3);
        GraficaIndividual gf = new GraficaIndividual(array, 1, 1);
        assertEquals(gf.obtenerMaximoValor() ,3);
    }
}