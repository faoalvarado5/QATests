package SingleMap;

import Classes.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.print.Pageable;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GuiMapSingleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void actualizar_datos_progresivos() {

        // Caso de prueba #58
        ArrayList<agente> arrayList = new ArrayList<agente>();
        agente agente = new agente();
        agente.setEstado("e");
        arrayList.add(agente);
        enfermedad enfermedad = new enfermedad();
        mapa mapa = new mapa();
        DatosActuales datosActuales = new DatosActuales();
        JFrame frame = new JFrame("Simulacion de propagacion de COVID-19");
        GuiMapSingle guiMapSingle = new GuiMapSingle(enfermedad, arrayList, mapa, datosActuales, frame);
        assertEquals(guiMapSingle.datos_progresivos_de_la_enfermedad.getDias(), 1);
        guiMapSingle.actualizar_datos_progresivos();
        assertEquals(guiMapSingle.datos_progresivos_de_la_enfermedad.getDias(), 2);
    }
}