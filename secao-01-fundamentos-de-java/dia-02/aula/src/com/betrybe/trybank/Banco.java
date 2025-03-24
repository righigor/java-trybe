package  com.betrybe.trybank;

public class Banco {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(0);

        conta.mostraMessagem();
        conta.depositar(500);
        double valorConvertido = conta.converterMoeda(30, 5);

        ContaBancaria contaDois = new ContaBancaria(1000);
        contaDois.depositar(500);
    }
}
