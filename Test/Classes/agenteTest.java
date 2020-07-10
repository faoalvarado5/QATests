package Classes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.JUnitException;

import static org.junit.jupiter.api.Assertions.*;

class agenteTest{

    @BeforeEach
    void setUp() {
        System.out.println("Hola");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void mover_aleatoreamente() {
    }

    @Test
    void agregar_puntos_al_agente_de_tipo_2() {
    }

    @Test
    void aumentar_posicion_del_tipo_2() {
    }

    @Test
    void aumentar_dias_de_enfermos() {
    }

    @Test
    void invertir_posicion_x() {
    }

    @Test
    void invertir_posicion_y() {
    }

    @Test
    void mover_eje_x() {
    }

    @Test
    void mover_eje_y() {
    }

    @Test
    void mover_para_atras_eje_x() {
    }

    @Test
    void mover_para_atras_eje_y() {
    }

    @Test
    void setTipo() {
    }

    @Test
    void setEstado() {
    }

    @Test
    void setVelocidad_x() {
    }

    @Test
    void setVelocidad_y() {
    }

    @Test
    void setVelocidad_maxima() {
    }

    @Test
    void setVelocidad_minima() {
    }

    @Test
    void setPosicion_en_eje_x() {
    }

    @Test
    void setPosicion_en_eje_y() {
    }

    @Test
    void setTiempo_enfermo() {
    }

    @Test
    void getTipo() {
    }

    @Test
    void getEstado() {

        agente agente = new agente();
        agente.setEstado("e");
        assertEquals(agente.getEstado(), "e");
    }

    @Test
    void getVelocidad_x() {
    }

    @Test
    void getVelocidad_y() {
    }

    @Test
    void getVelocidad_maxima() {
    }

    @Test
    void getVelocidad_minima() {
    }

    @Test
    void getPosicion_en_eje_x() {
    }

    @Test
    void getPosicion_en_eje_y() {
    }

    @Test
    void getTiempo_enfermo() {
    }

    @Test
    void getPosiciones_del_tipo_2() {
    }

    @Test
    void setPosiciones_del_tipo_2() {
    }

    @Test
    void getPosicion_del_tipo_2() {
    }

    @Test
    void setPosicion_del_tipo_2() {
    }

    @Test
    void testToString() {
    }
}