public class Conta {
    // Atributos da classe:
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular; // Composição do objeto da classe Cliente

    private static int totalDeContas;
    /*
     * Palavra static define que o atributo é da classe. Ou seja, os objetos vão
     * compartilha-lo
     */

    // Método Construtor:
    Conta(int agencia, int numero) {
        Conta.totalDeContas++;
        System.out.println("Total de contas criadas: " + Conta.totalDeContas);
        if (agencia <= 0 || numero <= 0) {
            System.out.println("O número da agência ou número da conta tem que ser maior que 0");
            return;
        }
        this.agencia = agencia;
        this.numero = numero;
        System.out.println("Conta criada!!!");
    }

    // Métodos getters e setters:
    public static int getTotalDeContas() {
        return Conta.totalDeContas;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

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
