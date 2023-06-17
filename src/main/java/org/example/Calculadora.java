package org.example;
public class Calculadora {
    private int numero1;
    private int numero2;

// --Commented out by Inspection START (17-Jun-23 19:04):
//    private void Calculadora(int x, int y) {
//        this.numero1 = x;
//        this.numero2 = y;
//    }
// --Commented out by Inspection STOP (17-Jun-23 19:04)

    public int sumar(int x, int y) {
        return x + y;
    }

    public int restar(int x, int y) {
        return x - y;
    }

    public int multiplicar(int x, int y) {
        return x * y;
    }
    public double dividir(int x, int y) {
        return (double) x / y; }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
}

