public class Conta {
    // Atributos da classe:
    double saldo;
    int agencia;
    int numero;
    String titular;

    // Métodos da classe:
    void depositar(double valor) {
        saldo += valor;
    }
}
