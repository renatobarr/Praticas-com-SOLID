public class Main {
    public static void main(String[] args) {
        System.out.println("==== S - Responsabilidade Única ====");
        CalculadoraFrete calc = new CalculadoraFretePadrao();
        PersistenciaFrete persistencia = new PersistenciaArquivo();
        ProcessadorEncomendas processador = new ProcessadorEncomendas(calc, persistencia);
        processador.processar("ABC123", 5.0);

        System.out.println("\n==== O - Aberto/Fechado ====");
        SistemaPagamento sistemaPagamento = new SistemaPagamento();
        sistemaPagamento.realizarPagamento(new PagamentoPIX(), 200.0);
        sistemaPagamento.realizarPagamento(new PagamentoCartao(), 150.0);

        System.out.println("\n==== L - Substituição de Liskov ====");
        ContaBancaria conta1 = new ContaBancaria();
        conta1.depositar(1000);
        conta1.sacar(200);
        System.out.println("Saldo conta comum: R$" + conta1.getSaldo());

        ContaPoupanca conta2 = new ContaPoupanca(false);
        conta2.depositar(1000);
        conta2.sacar(200);
        System.out.println("Saldo conta poupança: R$" + conta2.getSaldo());

        System.out.println("\n==== I - Segregação de Interfaces ====");
        Carro carro = new Carro();
        carro.dirigir();

        Aviao aviao = new Aviao();
        aviao.dirigir();
        aviao.voar();

        Barco barco = new Barco();
        barco.navegar();
    }
}