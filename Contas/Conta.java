package Contas;

public interface Conta {
    double getSaldo();
    void deposita(double valor);
    void saca(double valor, String data);
}
