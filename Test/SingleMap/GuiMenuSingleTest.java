package SingleMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
}