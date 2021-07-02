package main;

public abstract class CarroGenerico implements Velocidade {
    private int massa;

    public CarroGenerico(int massa) {
        this.massa = massa;
    }
    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    @Override
    public void acelerar(int aclr, int m) {
        System.out.println(aclr*massa);
    }
}
