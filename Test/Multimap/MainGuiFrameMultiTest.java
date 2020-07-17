package Multimap;

import Classes.agente;
import Classes.enfermedad;
import Classes.mapa;
import SingleMap.MainGuiFrameSingle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainGuiFrameMultiTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void MainGuiFrameMulti() throws InterruptedException {

        // Prueba 54
        agente agente = new agente();

        ArrayList<agente> a1 = new ArrayList<>();
        a1.add(agente);
        mapa mapa = new mapa();

        enfermedad enfermedad = new enfermedad();

        MainGuiFrameMulti mF = new MainGuiFrameMulti(a1,mapa,enfermedad,1);

        Thread.sleep(1000);

        assertEquals("Simulación de propagación de CODE-VID", mF.f.getTitle());
    }
}