//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.acelerar();
        carro.frear();

        Moto moto = new Moto();
        moto.acelerar();
        moto.frear();
        moto.darGrau();
    }
}