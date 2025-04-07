package codigos_implementados;

public interface Conta {
    void depositar(double valor);
    double getSaldo();
}


class ContaBancaria implements Conta {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}


class ContaPoupanca implements Conta {
    protected double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }


    public void resgatar(double valor) {
    
        System.out.println("Resgate agendado no valor de: R$" + valor);
    }
}
