package main;

public class Carros{
    public static void main(String[] args) {
        CarroP c1 = new CarroP(2);
        CarroC c2 = new CarroC(2);
        c1.acelerar(4,1);
        c2.acelerar(2,80);
    }
}
