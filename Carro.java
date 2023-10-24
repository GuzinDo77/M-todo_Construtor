public class Carro{
    private String cor;
    private String modelo;
    private int aro;
    private double valorCarro;

    public Carro(){

    }
    public Carro(int aro){
        this.aro=aro;
    }

    public Carro(int aro, String cor){
        this.aro=aro;
        this.cor=cor;
    }

    public Carro(int aro, String cor, String modelo){
        this.aro=aro;
        this.cor=cor;
        this.modelo=modelo;
    }

    public Carro(int aro, String cor, String modelo, double valorCarro){
        this.aro=aro;
        this.cor=cor;
        this.modelo=modelo;
        this.valorCarro=valorCarro;
    }
}