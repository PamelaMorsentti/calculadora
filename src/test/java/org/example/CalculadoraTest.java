package org.example;

/*import org.junit.jupiter.api.Test;*/

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void sumar() {
    }

    @org.junit.jupiter.api.Test
    void restar() {
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
    }
}
*/
class CalculadoraTest {
    @org.junit.jupiter.api.Test
    public void testSuma(){
        Calculadora cal=new Calculadora();
        assertEquals(9,cal.sumar(6,3));
    }
/*
    @Test
    public void testSuma(){
        Calculadora cal=new Calculadora();
        assertEquals(9,cal.sumar(5,3));
    }
}*/

    @org.junit.jupiter.api.Test
    public void testResta(){
        Calculadora cal=new Calculadora();
        assertEquals(3,cal.restar(6,3));
    }
    @org.junit.jupiter.api.Test
    public void testMultiplicar(){
        Calculadora cal=new Calculadora();
        assertEquals(21,cal.multiplicar(7,3));
    }

    @org.junit.jupiter.api.Test
    public void testDividir(){
        Calculadora cal=new Calculadora();
        assertEquals(7,cal.dividir(21,3));
    }
}