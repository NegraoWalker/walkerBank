public class Conta {
    // Atributos da classe:
    double saldo;
    int agencia;
    int numero;
    Cliente titular; // Composição do objeto da classe Cliente

    // Métodos da classe:
    public void depositar(double valor) {
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }

    public boolean transferir(Conta nomeConta, double valor) {
        nomeConta.sacar(valor);
        this.depositar(valor);
        return true;
    }
}
