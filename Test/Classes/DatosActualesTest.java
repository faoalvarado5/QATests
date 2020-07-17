package Classes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatosActualesTest {

    @Test
    void agregar_datos_de_enfermos() {

        // Prueba 52
        DatosActuales datosActuales = new DatosActuales();
        datosActuales.agregar_datos_de_enfermos(7);
        assertEquals(datosActuales.getCantidad_de_enfermos().get(0),7);

    }

    @Test
    void agregar_datos_de_sanos() {

        //Prueba 50
        DatosActuales datosActuales = new DatosActuales();
        datosActuales.agregar_datos_de_sanos(3);
        assertEquals(datosActuales.getCantidad_de_sanos().get(0),3);
    }

    @Test
    void agregar_datos_de_curados() {

        //Prueba 51
        DatosActuales datosActuales = new DatosActuales();
        datosActuales.agregar_datos_de_curados(5);
        assertEquals(datosActuales.getCantidad_de_curados().get(0),5);

    }


    @Test
    void aumentar_dias_corriendo() {

        //Prueba 53
        DatosActuales datosActuales = new DatosActuales();
        datosActuales.setDias(1);
        datosActuales.aumentar_dias_corriendo();
        assertEquals(datosActuales.getDias(),2);
    }



}