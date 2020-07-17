package Classes;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GraficaMultipleTest {

    @Test
    void obtenerMinimoValor() {

        //Prueba 48
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(1);
        a2.add(2);
        a2.add(3);

        a3.add(1);
        a3.add(2);
        a3.add(3);

        GraficaMultiple gm = new GraficaMultiple(a1,a2,a3,1,1);
        assertEquals(gm.obtenerMinimoValor(),1.0); }



    @Test
    void obtenerMaximoValor(){
        //Prueba 49
        ArrayList<Integer> a1 = new ArrayList<>();
        ArrayList<Integer> a2 = new ArrayList<>();
        ArrayList<Integer> a3 = new ArrayList<>();

        a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(1);
        a2.add(2);
        a2.add(3);

        a3.add(1);
        a3.add(2);
        a3.add(3);

        GraficaMultiple gm = new GraficaMultiple(a1,a2,a3,1,1);
        assertEquals(gm.obtenerMaximoValor(),3.0);

    }



}