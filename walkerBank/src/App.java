public class App {
    public static void main(String[] args) {
        // Conta conta1 = new Conta();
        // Conta conta2 = new Conta();
        // // Depositando o valor:
        // conta1.depositar(1000);
        // // Exibindo na tela se o saldo deu certo, o valro do saque e o saque
        // atualizado:
        // System.out.println("Valor depositado: " + conta1.saldo);
        // System.out.println("Foi efetuado o saque: " + conta1.sacar(500));
        // System.out.println("Saldo Total Atualizado: " + conta1.saldo);
        // // Transferindo o valor de 300 reais da conta1 para conta2
        // System.out.println("Transferência feita: " + conta2.transferir(conta1, 300));
        // System.out.println("Saldo da conta2: " + conta2.saldo);
        // System.out.println("Saldo da conta1: " + conta1.saldo);

        Cliente walker = new Cliente();
        walker.nome = "Walker Esteves Negrão";
        walker.cpf = "07845684892233";
        walker.profissao = "Programador";

        Conta contaWalker = new Conta();
        contaWalker.titular = walker;

        contaWalker.depositar(1500);
        System.out.println("Nome do Titular da conta: " + contaWalker.titular.nome);
        System.out.println("Saldo disponível: " + contaWalker.saldo);

    }
}
