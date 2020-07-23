package SingleMap;

import org.junit.jupiter.api.*;

import javax.swing.*;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class GuiMenuSingleTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Order(10)
    void startTest() throws AWTException, InterruptedException {

        // Caso de prueba #13
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.delay(1);

        robot.mouseMove(915, 570);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 570);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.mouseMove(915, 620);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(1)
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
    @Order(2)
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
    @Order(3)
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
    @Order(4)
    void loadValidMapFile() throws AWTException, InterruptedException {

        // Caso de prueba #7
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(5)
    void loadValidAgentsFile() throws AWTException, InterruptedException {

        // Caso de prueba #9
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(6)
    void loadValidDiseaseFile() throws AWTException, InterruptedException {

        // Caso de prueba #14
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.delay(1);

        robot.mouseMove(915, 570);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 570);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(7)
    void healedGraphicsTest() throws AWTException, InterruptedException {

        // Caso de prueba #16
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.delay(1);

        robot.mouseMove(915, 570);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 570);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.mouseMove(915, 620);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(2000);

        robot.mouseMove(1050, 35);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(8)
    void peopleGraphicsTest() throws AWTException, InterruptedException {

        // Caso de prueba #17
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.delay(1);

        robot.mouseMove(915, 570);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 570);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.mouseMove(915, 620);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(2000);

        robot.mouseMove(1350, 35);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(9)
    void sickGraphicsTest() throws AWTException, InterruptedException {

        // Caso de prueba #18
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.delay(1);

        robot.mouseMove(915, 570);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 570);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.mouseMove(915, 620);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(2000);

        robot.mouseMove(1150, 35);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                assertEquals(((JDialog)window1).getTitle(), "Open");
            }
        }
    }

    @Test
    @Order(11)
    void loadInvalidMapFile() throws AWTException, InterruptedException {

        // Caso de prueba #8
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                if(((JDialog)window1).getTitle() == "Message"){
                    assertEquals(((JDialog)window1).getTitle(), "Message");
                }
            }
        }
    }

    @Test
    @Order(12)
    void loadInvalidAgentsFile() throws AWTException, InterruptedException {

        // Caso de prueba #10
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                if(((JDialog)window1).getTitle() == "Message"){
                    assertEquals(((JDialog)window1).getTitle(), "Message");
                }
            }
        }
    }

    @Test
    @Order(13)
    void loadInvalidDiseaseFile() throws AWTException, InterruptedException {

        // Caso de prueba #15
        GuiMenuSingle gms = new GuiMenuSingle();

        Robot robot = new Robot();
        robot.mouseMove(915, 470);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

        robot.delay(1);

        robot.mouseMove(915, 520);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(750, 540);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        robot.delay(1);

        robot.mouseMove(915, 570);
        robot.delay(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseMove(915, 435);
        Thread.sleep(1000);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);

        for (Window window1 : JDialog.getWindows()) {
            if ( window1 instanceof JDialog) {
                if(((JDialog)window1).getTitle() == "Message"){
                    assertEquals(((JDialog)window1).getTitle(), "Message");
                }
            }
        }
    }
}