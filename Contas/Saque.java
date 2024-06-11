package Contas;

public class Saque {

    private String data;
    private double valor;

    public Saque(String data, double valor) {
        this.data = data;
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public double getValor() {
        return valor;
    }
}

