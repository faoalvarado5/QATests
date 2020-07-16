package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class enfermedadTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getProbabilidad_muerte() {

        // Caso de prueba #37
        enfermedad enfermedad = new enfermedad();
        assertEquals(enfermedad.getProbabilidad_muerte(), 0.0f);
        enfermedad.setProbabilidad_muerte((float)2.0);
        assertEquals(enfermedad.getProbabilidad_muerte(), (float) 2.0);
    }

    @Test
    void getDias_de_muerte() {

        // Caso de prueba #38
        enfermedad enfermedad = new enfermedad();
        assertEquals(enfermedad.getDias_de_muerte(), 0);
        enfermedad.setDias_de_muerte(18);
        assertEquals(enfermedad.getDias_de_muerte(), 18);
    }

    @Test
    void getDias_de_recuperacion() {

        // Caso de prueba #39
        enfermedad enfermedad = new enfermedad();
        assertEquals(enfermedad.getDias_de_recuperacion(), 0);
        enfermedad.setDias_de_recuperacion(20);
        assertEquals(enfermedad.getDias_de_recuperacion(), 20);
    }

    @Test
    void getReinfeccion() {

        // Caso de prueba #40
        enfermedad enfermedad = new enfermedad();
        assertEquals(enfermedad.getReinfeccion(), 0);
        enfermedad.setReinfeccion(0);
        assertEquals(enfermedad.getReinfeccion(), 0);
    }

    @Test
    void setReinfeccion() {

        // Caso de prueba #41
        enfermedad enfermedad = new enfermedad();
        assertEquals(enfermedad.getReinfeccion(), 0);
        enfermedad.setReinfeccion(1);
        assertEquals(enfermedad.getReinfeccion(), 1);
    }
}