package SingleMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import java.awt.*;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class GuiMenuSingleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
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

    @Test
    void cargarAgentes(){

        // Caso de prueba #11
        GuiMenuSingle gms = new GuiMenuSingle();
        gms.boton_agentes.doClick();

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    void cargarEnfermedad(){

        // Caso de prueba #12
        GuiMenuSingle gms = new GuiMenuSingle();
        gms.boton_enferdad.doClick();

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    void loadValidMapFile(){

        // Caso de prueba #7
        GuiMenuSingle gms = new GuiMenuSingle();
        gms.boton_mapa.doClick();

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {

                //System.out.println((JFileChooser)window1.l);
            }
        }
    }
}