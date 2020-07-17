package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class mapaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getLargo() {

        // Caso de prueba #33
        mapa mapa = new mapa();
        assertEquals(mapa.getLargo(), 0);
        mapa.setLargo(2);
        assertEquals(mapa.getLargo(), 2);
    }

    @Test
    void setLargo() {

        // Caso de prueba #34
        mapa mapa = new mapa();
        assertEquals(mapa.getLargo(), 0);
        mapa.setLargo(5);
        assertEquals(mapa.getLargo(), 5);
    }

    @Test
    void getAncho() {

        // Caso de prueba #35
        mapa mapa = new mapa();
        assertEquals(mapa.getLargo(), 0);
        mapa.setLargo(2);
        assertEquals(mapa.getLargo(), 2);
    }

    @Test
    void setAncho() {

        // Caso de prueba #36
        mapa mapa = new mapa();
        assertEquals(mapa.getLargo(), 0);
        mapa.setLargo(5);
        assertEquals(mapa.getLargo(), 5);
    }

    @Test
    void addPared() {

        //Caso de prueba 46
        mapa mapa = new mapa();
        pared pared = new pared(2,2,2,2);
        mapa.addPared(pared);
        assertTrue(mapa.getParedes().size()>0);
    }

}