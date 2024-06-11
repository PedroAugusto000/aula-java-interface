package Contas;

public class TesteConta {
    public static void main(String[] args) {
        ContaPoupanca conta = new ContaPoupanca(1000);
        conta.deposita(500);
        conta.saca(300, "11/06/2024");
        conta.saca(1500, "11/06/2024"); // Saldo insuficiente
        conta.showListaSaque();
    }
}