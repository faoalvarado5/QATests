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
    void test1(){
        GuiMenuSingle test = new GuiMenuSingle();
        assertEquals(test.f.getTitle(), "Simulacion de propagacion de COVID-19");
    }
}