package Contas;

public class ContaPoupanca implements Conta {

    private double saldo;
    private List<Saque> listaSaque;

    public ContaPoupanca(double saldo) {
        this.saldo = saldo;
        this.listaSaque = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void deposita(double valor) {
        saldo += valor;
    }

    public void saca(double valor, String data) {
        if (saldo >= valor) {
            saldo -= valor;
            listaSaque.add(new Saque(data, valor));
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void atualiza(double taxaSelic) {
        saldo += saldo * taxaSelic;
    }

    public void showListaSaque() {
        System.out.println("==== LISTA DE SAQUE ====");
        for (Saque saque : listaSaque) {
            System.out.println("Data: " + saque.getData() +
                    " Valor: " + saque.getValor());
        }
    }
}

