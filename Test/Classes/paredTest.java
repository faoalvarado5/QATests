package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class paredTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getEs_horizontal() {

        // Caso de prueba #31
        pared pared = new pared();
        assertTrue(pared.getEs_horizontal());
        pared.setEs_horizontal(true);
        assertTrue(pared.getEs_horizontal() == true);
    }

    @Test
    void setEs_horizontal() {

        // Caso de prueba #32
        pared pared = new pared();
        assertTrue(pared.getEs_horizontal());
        pared.setEs_horizontal(false);
        assertTrue(pared.getEs_horizontal() == false);
    }
}