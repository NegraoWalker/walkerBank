public class App {
    public static void main(String[] args) {
        Conta conta = new Conta(-1, -2); // Contrutor chamado
        Cliente cliente = new Cliente();

        // conta.setAgencia(-1);
        // conta.setNumero(6900021);
        conta.depositar(1000);
        conta.setTitular(cliente);

        System.out.println(conta.getSaldo());
        cliente.setNome("Walker Esteves Negrão");
        cliente.setCpf("07844333345566");
        cliente.setProfissao("Programador");

        System.out.println(cliente.getNome());
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setNome("Sandra Aparecida");
        conta.getTitular().setCpf("068423233235677");
        conta.getTitular().setProfissao("Dona de casa");

        System.out.println(cliente.getNome());

        Conta novaConta = new Conta(-1, -2);
        novaConta.depositar(1000);

        System.out.println(Conta.getTotalDeContas());

    }
}
