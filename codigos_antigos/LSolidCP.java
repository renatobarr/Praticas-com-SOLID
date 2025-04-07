package codigos_antigos;

public class ContaPoupanca extends ContaBancaria {

    @Override
    public void sacar(double valor) {
        throw new UnsupportedOperationException("Resgate não é permitido direto.");
    }
}