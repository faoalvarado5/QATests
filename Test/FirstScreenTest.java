import Multimap.ClientGui;
import Multimap.GuiMapMulti;
import Multimap.ServerGui;
import SingleMap.GuiMenuSingle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.awt.*;

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

    @Test
    void errorServerPlayer() throws InterruptedException {

        // Caso de prueba #5
        FirstScreen fs = new FirstScreen();
        //Thread.sleep(2000);
        fs.serverplayer.doClick();
        //Thread.sleep(2000);
        ServerGui sg = new ServerGui();
        sg.start_button.doClick();
        Thread.sleep(2000);
        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                //System.out.println(((JDialog)window1).getTitle());
                if(((JDialog)window1).getTitle() == "Message"){
                    assertEquals("Message", ((JDialog)window1).getTitle());
                }
            }
        }
    }

    @Test
    void errorServerConnection() throws InterruptedException {

        // Caso de prueba #6
        FirstScreen fs = new FirstScreen();
        //Thread.sleep(2000);
        fs.clientplayer.doClick();
        //Thread.sleep(2000);
        ClientGui cg = new ClientGui();
        cg.name_of_the_country.setText("192.0.2.1");
        Thread.sleep(2000);
        cg.start_button.doClick();
        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                //System.out.println(((JDialog)window1).getTitle());
                if(((JDialog)window1).getTitle() == "Menu de conexion de servidor"){
                    assertEquals("Menu de conexion de servidor", ((JDialog)window1).getTitle());
                }
            }
        }
    }
}