package SingleMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class GuiMenuSingleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void test1() throws InterruptedException {
        GuiMenuSingle test = new GuiMenuSingle();
        Thread.sleep(2000);
        assertEquals(test.f.getTitle(), "Simulacion de propagacion de COVID-19");
    }

    @Test
    void cargarMapa(){

        // Caso de prueba #4
        GuiMenuSingle gms = new GuiMenuSingle();
        gms.boton_mapa.doClick();

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }
}