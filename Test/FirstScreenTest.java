import Multimap.GuiMapMulti;
import SingleMap.GuiMenuSingle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstScreenTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void singlePlayer() throws InterruptedException {

        // Caso de prueba #1
        FirstScreen fs = new FirstScreen();
        //Thread.sleep(2000);
        fs.singleplayer.doClick();
        //Thread.sleep(2000);
        GuiMenuSingle gms = new GuiMenuSingle();
        assertEquals("Configuracion de datos.", gms.f.getTitle());
    }

    @Test
    void serverPlayer() throws InterruptedException {

        // Caso de prueba #2
        FirstScreen fs = new FirstScreen();
        //Thread.sleep(2000);
        fs.serverplayer.doClick();
        //Thread.sleep(2000);
        GuiMenuSingle gms = new GuiMenuSingle();
        assertEquals("Configuracion de datos.", gms.f.getTitle());
    }

    @Test
    void clientPlayer() throws InterruptedException {

        // Caso de prueba #3
        FirstScreen fs = new FirstScreen();
        //Thread.sleep(2000);
        fs.clientplayer.doClick();
        //Thread.sleep(2000);
        GuiMenuSingle gms = new GuiMenuSingle();
        assertEquals("Configuracion de datos.", gms.f.getTitle());
    }
}