package main;

public class CarroC extends CarroGenerico{

    public CarroC(int massa) {
        super(massa);
    }

    @Override
    public void acelerar(int aclr, int m) {
        System.out.println("Acelerando a KM/h = "+ aclr*m);
    }
}
