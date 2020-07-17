package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Generador_latexTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void generarLatex() throws IOException {

        // Caso de prueba #60
        ArrayList<Integer> array = new ArrayList<Integer>();
        array.add(1);
        array.add(2);
        Generador_latex generador_latex = new Generador_latex();
        generador_latex.generarLatex(5, 5, array);
        File file = new File("latex/salida.tex");
        assertTrue(file != null);
    }
}