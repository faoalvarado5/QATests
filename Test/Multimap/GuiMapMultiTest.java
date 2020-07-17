package Multimap;

import Classes.DatosActuales;
import Classes.agente;
import Classes.enfermedad;
import Classes.mapa;
import SingleMap.GuiMapSingle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class GuiMapMultiTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void actualizar_datos_progresivos() {

        // Caso de prueba #59
        ArrayList<agente> arrayList = new ArrayList<agente>();
        agente agente = new agente();
        agente.setEstado("e");
        arrayList.add(agente);
        enfermedad enfermedad = new enfermedad();
        mapa mapa = new mapa();
        DatosActuales datosActuales = new DatosActuales();
        JFrame frame = new JFrame("Simulacion de propagacion de COVID-19");
        GuiMapMulti guiMapMulti = new GuiMapMulti(enfermedad, arrayList, mapa, datosActuales, frame);
        assertEquals(guiMapMulti.datos_progresivos_de_la_enfermedad.getDias(), 1);
        guiMapMulti.actualizar_datos_progresivos();
        assertEquals(guiMapMulti.datos_progresivos_de_la_enfermedad.getDias(), 2);
    }
}