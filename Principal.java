public class Principal {
    
    public static void main(String args){

        Carro car = new Carro();
        Carro carAro = new Carro(17);
        Carro carTresConstrutores = new Carro (14, "Vermelho Fosco", "Corsa Turbo");
        Carro carQuatroConstrutores = new Carro(15, "Azul Calcinha", "Uno Mile", 15300);

        System.out.println(car);
        System.out.println(carAro);
        System.out.println(carTresConstrutores);
        System.out.println(carQuatroConstrutores);
    }
}
