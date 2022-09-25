public class App {
    public static void main(String[] args) throws Exception {
        /*
        vehiculo carro = new vehiculo();
        carro.setTipo("Campero");
        carro.setVelMaxima(120);
        System.out.println(carro.getTipo());
        System.out.println(carro.getVelMaxima());
        vehiculo moto = new vehiculo();
        moto.setTipo("Scooter");
        moto.setVelMaxima(50);
        System.out.println(moto.getTipo());
        System.out.println(moto.getVelMaxima());*/
    }
}

abstract class vehiculo{
    private String tipo;
    private int velMaxima;
    private String sonido;

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}