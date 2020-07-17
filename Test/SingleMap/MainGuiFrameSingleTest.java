package SingleMap;

import Classes.agente;
import Classes.enfermedad;
import Classes.mapa;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainGuiFrameSingleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void MainGuiFrameSingle() throws InterruptedException {

        // Prueba 54
        agente agente = new agente();

        ArrayList<agente> a1 = new ArrayList<>();
        a1.add(agente);
        mapa mapa = new mapa();

        enfermedad enfermedad = new enfermedad();


        MainGuiFrameSingle mF = new MainGuiFrameSingle(a1,mapa,enfermedad,1);

        Thread.sleep(1000);

        assertEquals("Simulación de propagación de CODE-VID", mF.f.getTitle());



    }
}