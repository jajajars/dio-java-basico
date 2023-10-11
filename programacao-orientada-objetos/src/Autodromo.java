public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("855652");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("566555");
        z400.ligar();

        Veiculo veiculo = z400  ;
        veiculo.ligar();
    }
}
