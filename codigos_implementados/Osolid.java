package codigos_implementados;

interface MetodoPagamento {
    void pagar(double valor);
}

class PagamentoCartao implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com CARTÃO.");
    }
}

class PagamentoPIX implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via PIX.");
    }
}

class PagamentoBoleto implements MetodoPagamento {
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado via BOLETO.");
    }
}

public class SistemaPagamento {
    public void realizarPagamento(double valor, MetodoPagamento metodo) {
        metodo.pagar(valor);
    }
}
